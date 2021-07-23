package racing;

import java.util.List;

public class ResultView {

    static void printWinners(List<Car> winners) {
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
}
