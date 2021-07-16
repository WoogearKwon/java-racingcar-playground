package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @Test
    void sample_car_create() {
        Car sample = new Car("sample");
        assertThat(sample.getName()).isEqualTo("sample");
    }

    @Test
    void sample_car_run() {
        Car sample = new Car("sample");
        sample.go();
        assertThat(sample.getDistance()).isEqualTo(1);
    }
}
