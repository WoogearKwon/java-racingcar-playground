package racing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CarsTest {

    @Test
    void findWinners() {
        Car woo = new Car("woo", 2);
        Car soo = new Car("soo", 2);
        Car joo = new Car("joo", 1);

        List<Car> original = Arrays.asList(woo, soo, joo);
        Cars cars = new Cars(original);

        assertThat(cars.findWinners()).containsExactly(woo, soo);
    }
}
