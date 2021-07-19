package racing;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private static final int FORWARD_INT = 4;
    private static final int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        return getRandomNumber() >= FORWARD_INT;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
