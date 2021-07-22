package racing;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        position = new Position(0);
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void move(MovingStrategy strategy) {
        if (strategy.movable()) {
            position = position.move();
        }
    }

    public void move(RandomMovingStrategy strategy) {
        if (strategy.movable()) {
            position = position.move();
        }
    }
}
