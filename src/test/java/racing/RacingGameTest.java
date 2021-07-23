package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingGameTest {
    @Test
    void namingTest() {
        assertThatThrownBy(() -> {
            new RacingGame("woo", 3);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
