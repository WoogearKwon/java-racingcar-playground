import racing.RacingGame;
import view.InputView;

public class Main {
    public static void main(String[] args) {
        String names = InputView.inputNames();
        int tryNumber = Integer.parseInt(InputView.inputTryNumber());

        RacingGame game = new RacingGame(names, tryNumber);
        game.startGame();
    }
}
