package racing;

public class Car {
    private final Name name;
    private int position;

    public Car(String name) {
        this.name = new Name(name);
        position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move(MovingStrategy strategy) {
        if (strategy.movable()) {
            position++;
        }
    }

    public void move(RandomMovingStrategy strategy) {
        if (strategy.movable()) {
            position++;
        }
    }
}
