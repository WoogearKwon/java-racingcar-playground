package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    static List<String> inputNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] names = input.split(",");

        return Arrays.asList(names);
    }

    static int inputNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }
}
