package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void move1() {
        Car car = new Car("woo");
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void move2() {
        Car car = new Car("woo");
        car.move(new RandomMovingStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("Name의 글자수가 5글자를 초과하면 IllegalArgumentException을 반환한다.")
    void nameLongTest() {
        assertThatThrownBy(() -> {
            new Car("more than 5 letters");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Name이 빈 문자열이면 IllegalArgumentException을 반환한다.")
    void nameBlankTest() {
        assertThatThrownBy(() -> {
            new Car("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
