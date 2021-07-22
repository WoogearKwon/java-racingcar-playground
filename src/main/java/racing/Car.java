package racing;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int FORWARD_INT = 4;
    private static final int MAX_BOUND = 10;

    private final Name name;

    /* 원시값과 문자열을 포장한다. */
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name.trim());
        this.position = new Position(position);

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

    public Position getMaxPosition(Position maxPosition) {
        if (position.isBiggerThan(maxPosition)) {
            return position;
        }
        return maxPosition;
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }
}
