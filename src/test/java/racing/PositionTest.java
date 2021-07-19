package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PositionTest {

    @Test
    void create() {
        Position position = new Position(3);
        /* 객체와 객체를 비교하는 것을 통해 객체지향 적 사고방식을 가지는 연습을 하자*/
        assertThat(position).isEqualTo(new Position(3));
    }

    @Test
    void valid() {
        assertThatThrownBy(() -> {
           new Position(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move() {
        Position position = new Position(3);
        assertThat(position.move()).isEqualTo(new Position(4));
    }
}
