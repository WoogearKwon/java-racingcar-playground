package view;

import racing.Car;

import java.util.List;

public class ResultView {
    public static void printWinners(List<Car> winners) {
        StringBuilder winnerNames = new StringBuilder();
        for (Car winner : winners) {
            winnerNames.append(",").append(winner.getName());
        }
        winnerNames.append("가 최종 우승했습니다.");
        System.out.println(winnerNames.toString());
    }
}
