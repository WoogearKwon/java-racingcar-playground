package racing.model;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private final static int FORWARD_NUM = 4;
    private final static int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        return getRandomNumber() >= FORWARD_NUM;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
