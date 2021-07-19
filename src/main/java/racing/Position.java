package racing;

import java.util.Objects;

/**
 * 아래와 같이 원시값을 객체가 포장하면
 * position의 유효범위까지도 객체가 책임을 지게 된다.
 * 사용에 익숙해지면 이와 같이 좋은 점이 많다.
 * */
public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be smaller than zero");
        }
        this.position = position;
    }

    public Position move() {
        /*
          getter/setter 대신 아래와 같으 메서드를 사용한다면
          객체가 생성된 이후로 외부에 의해 절대 값이 변경될 수 없는 객체가 된다.
          이와 같은 객체를 Value Object 라고 한다.
          */
        return new Position(position + 1);
    }

    public Position move2() {
        /*
          인스턴스가 많이 만들어짐으로 인해서 가비지 콜렉터의 작동으로 성능 이슈가 생긴다면
          아래와 같이 수정할 수 있다. 이럴 경우 가변객체가 된다.
          그러나 너무 처음부터 성능만 고려하지는 마라.
          */
        position = position + 1;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
