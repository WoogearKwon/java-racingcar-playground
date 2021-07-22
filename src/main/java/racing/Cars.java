package racing;

import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void move(int tryNumber) {
        for (int i = 0; i < tryNumber; i++) {
            moveCars();
            System.out.println();
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            car.move();
            ResultView.printMoveStatus(car);
        }
    }

    public List<Car> findWinners() {
        return findWinners(getMaxPosition());
    }

    private Position getMaxPosition() {
        Position mPosition = new Position(0);

        for (Car car : cars) {
            mPosition = car.getMaxPosition(mPosition);
        }
        return mPosition;
    }

    private List<Car> findWinners(Position maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }
}
