package racing;

import java.util.Random;

public class Car {
    private static final int FORWARD_INT = 4;
    private static final int MAX_BOUND = 10;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (getRandomNumber() >= FORWARD_INT) {
            position++;
        }
    }

    protected int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
