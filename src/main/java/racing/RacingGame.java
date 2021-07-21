package racing;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int tryNumber;
    private boolean isFinished;

    public RacingGame(String carNames, int tryNumber) {
        this.cars = initCars(carNames);
        this.tryNumber = tryNumber;
        isFinished = false;
    }

    private static Cars initCars(String carNames) {
        if (StringUtils.isBlank(carNames)) {
            throw new IllegalArgumentException("Car names should not be blank");
        }

        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name));
        }

        return new Cars(cars);
    }

    public void startGame() {
        cars.move(tryNumber);
        isFinished = true;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
