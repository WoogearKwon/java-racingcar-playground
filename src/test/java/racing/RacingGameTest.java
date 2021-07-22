package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingGameTest {

    @Test
    void nameErrorTest() {
        assertThatThrownBy(() -> {
            RacingGame game = new RacingGame("", 3);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void startGameTest() {
        RacingGame game = new RacingGame("woo,goo,koo", 3);
        game.startGame();
        assertThat(game.isFinished()).isTrue();
    }
}
