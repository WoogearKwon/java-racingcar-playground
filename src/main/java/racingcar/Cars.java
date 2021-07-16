package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final ArrayList<Car> cars;

    public Cars(List<String> carList) {
        cars = new ArrayList<>();
        mapCars(carList);
    }

    private void mapCars(List<String> carList) {
        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carList.get(i)));
        }
    }

    public void startRacing(int laps) {
        for (int i = 0; i < laps; i++) {
            progressOneLap();
        }

        ResultView.printWinners(getWinner());
    }

    private void progressOneLap() {
        for (Car car : cars) {
            car.startRacing();
        }
        System.out.println();
    }

    private String getWinner() {
        StringBuilder winner = new StringBuilder();
        int winnersLaps = 0;

        for (Car car : cars) {
            if (winnersLaps == car.getLapCount()) {
                winner.append(", ").append(car.getName());
            }

            if (winnersLaps < car.getLapCount()) {
                winner = new StringBuilder(car.getName());
            }

            winnersLaps = car.getLapCount();
        }

        return winner.toString();
    }
}
