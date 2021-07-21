package racing;

import java.util.Random;

public class Car {
    private static final int FORWARD_INT = 4;
    private static final int MAX_BOUND = 10;

    private final Name name;
    private int positionInt;

    /* 원시값과 문자열을 포장한다. */
    private Position position;

    public Car(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Car name cannot be blank");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("Car name should be within 5 letters");
        }

        this.name = new Name(name.trim());
        this.position = new Position();
    }

    public Name getName() {
        return name;
    }

    public int getPositionNumber() {
        return position.getPosition();
    }

    public void move(RandomMovingStrategy strategy) {
        if (strategy.movable()) {
            position = position.move();
        }
    }

    public void move(MovingStrategy strategy) {
        if (strategy.movable()) {
            position = position.move();
        }
    }

    public void move(int randomNumber) {
        if (randomNumber >= MAX_BOUND) {
            position = position.move();
        }
    }

    public void move() {
        if (getRandomNumber() >= FORWARD_INT) {
            position = position.move();
        }
    }

    protected int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
