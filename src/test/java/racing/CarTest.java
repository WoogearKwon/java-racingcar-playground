package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @Test
    void move() {
        Car car = new Car("test");
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void stop() {
        Car car = new Car("test");
        car.move();
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
