package view;

import racing.Car;

import java.util.List;

public class ResultView {
    public static void printMoveStatus(Car car) {
        StringBuilder progress = new StringBuilder();
        for (int i = 0; i < car.getPositionNumber(); i++) {
            progress.append("-");
        }
        System.out.println(car.getName() + " : " + progress);
    }

    public static void printWinners(List<Car> winners) {
        StringBuilder winnerNames = new StringBuilder();
        for (Car winner : winners) {
            winnerNames.append(winner.getName()).append(",");
        }
        winnerNames.append("가 최종 우승했습니다.");
        System.out.println(winnerNames.toString());
    }
}
