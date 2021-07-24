package racing;

import racing.model.Car;
import racing.model.Cars;
import racing.util.StringUtils;
import racing.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int tryNumber;

    public RacingGame(String input, int tryNumber) {
        if (StringUtils.hasNotThreeNames(input)) {
            throw new IllegalArgumentException("you should input 3 different names");
        }

        cars = initCars(input);
        this.tryNumber = tryNumber;
    }

    private Cars initCars(String input) {
        String[] original = input.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : original) {
            cars.add(new Car(name));
        }

        return new Cars(cars);
    }

    public void startGame() {
        for (int i = 0; i < tryNumber; i++) {
            cars.move();
            System.out.println();
        }

        ResultView.printWinners(cars.findWinners());
    }
}
