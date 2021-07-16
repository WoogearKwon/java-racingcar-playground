package racingcar;

public class Car {
    private final String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void go() {
        distance++;
    }
}