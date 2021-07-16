package racingcar;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars(InputView.inputNames());
        cars.startRacing(InputView.inputNumber());
    }
}
