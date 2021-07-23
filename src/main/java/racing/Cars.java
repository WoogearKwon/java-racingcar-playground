package racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {
        Position maxPosition = new Position(0);

        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }

        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(maxPosition)) {
                winners.add(car);
            }
        }

        return winners;
    }

    public void move() {
        for (Car car : cars) {
            car.move(new RandomMovingStrategy());
        }
    }
}
