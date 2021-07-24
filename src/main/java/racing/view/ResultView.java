package racing.view;

import racing.model.Car;

import java.util.List;

public class ResultView {

    public static void printWinners(List<Car> winners) {
        StringBuilder result = new StringBuilder();
        for (Car winner : winners) {
            result.append(winner.getName()).append(", ");
        }
        if (winners.size() == 1) {
            result.append(" is ");
        } else {
            result.append(" are ");
        }

        result.append(" winners");
        System.out.println(result.toString());
    }

    public static void printMoving(Car car) {
        StringBuilder distance = new StringBuilder();
        for (int i = 0; i < car.getPosition().getNumber(); i++) {
            distance.append("-");
        }
        System.out.println(car.getName() + " : " + distance.toString());
    }
}
