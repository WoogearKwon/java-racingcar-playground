package racing;

import org.junit.jupiter.api.Test;
import racing.model.Car;
import racing.model.Cars;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void create() {
        Car woo = new Car("woo", 2);
        Car koo = new Car("koo", 1);
        Car soo = new Car("soo", 2);

        Cars cars = new Cars(Arrays.asList(woo, koo, soo));
        assertThat(cars.findWinners()).containsExactly(woo, soo);
    }
}
