package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        testCar.progressOneLap();
        assertThat(testCar.getLapCount()).isEqualTo(1);
    }

    @Test
    void test_racing() {
        testCar.startRacing();
        assertThat(testCar.getLapCount()).isEqualTo(1);
    }

    @Test
    void test_cars_5laps() {
        Cars cars = new Cars(Arrays.asList("Woog", "Minn", "Jake"));
        cars.startRacing(5);
    }
}
