import racing.RacingGame;
import racing.view.InputView;

public class Main {
    public static void main(String[] args) {
        String names = InputView.inputNames();
        int tryNumber = InputView.inputTryNumber();

        RacingGame game = new RacingGame(names, tryNumber);
        game.startGame();
    }
}
