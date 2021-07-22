package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    /*
    * 아래의 경우 move()안에서 난수를 생성하기 때문에 난수 생성 로직이 move에 의존성을 가진다.
    * 난수 생성은 내가 컨트롤 할 수 없기 때문에 테스트에 제약이 생긴다.
    * */
    @Test
    void move1() {
        Car car = new Car("test");
        car.move();
        assertThat(car.getPositionNumber()).isEqualTo(1);
    }

    /*
    * 아래의 경우 implement를 사용하여 난수 로직을 밖에서 관리할 수 있게 하기 때문에
    * 테스트가 용이해진.
    * */
    @Test
    void move2() {
        Car car = new Car("test");
        car.move(() -> true);
        assertThat(car.getPositionNumber()).isEqualTo(1);
    }

    /*
    * 아래는 위 로직에서 한 단계 더 나아가 난수 생성 로직 RandomMovingStrategy에서 관리하면서
    * 오버라이드 메서드를 통해 임의의 값을 넣어 테스트가 가능하다.
    * */
    @Test
    void move3() {
        Car car = new Car("test");
        car.move(new RandomMovingStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });
        assertThat(car.getPositionNumber()).isEqualTo(1);
    }

    @Test
    void stop() {
        Car car = new Car("test");
        car.move(() -> false);
        assertThat(car.getPositionNumber()).isEqualTo(0);
    }
}
