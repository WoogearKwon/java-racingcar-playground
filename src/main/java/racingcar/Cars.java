package racingcar;

import java.util.ArrayList;
import java.util.List;

// 일급 컬렉션을 사용
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
        int previousLaps = 0;

        for (Car car : cars) {
            if (previousLaps == car.getLapCount()) {
                winner.append(", ").append(car.getName());
            }

            if (previousLaps < car.getLapCount()) {
                winner = new StringBuilder(car.getName());
            }

            previousLaps = car.getLapCount();
        }

        return winner.toString();
    }
}
