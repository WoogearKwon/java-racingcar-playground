package racing;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
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

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public Position getMaxPosition(Position maxPosition) {
        if (position.isBiggerThan(maxPosition)) {
            return position;
        }

        return maxPosition;
    }
}
