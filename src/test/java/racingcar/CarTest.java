package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    Car testCar;

    @BeforeEach
    void setUp() {
        testCar = new Car("testCar");
    }

    @Test
    void sample_car_create() {
        assertThat(testCar.getName()).isEqualTo("testCar");
    }

    @Test
    void sample_car_run() {
        testCar.go();
        assertThat(testCar.getDistance()).isEqualTo(1);
    }

    @Test
    void test_racing_5laps() {
        testCar.startRacing(5);
        assertThat(testCar.getLapCount()).isEqualTo(5);
    }
}
