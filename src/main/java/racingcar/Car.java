package racingcar;

public class Car {
    private final String name;
    private int distance;
    private int lapCount;
    private String progress;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
        this.lapCount = 0;
        this.progress = "";
    }

    String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getLapCount() {
        return lapCount;
    }

    public void go() {
        distance++;
    }

    public void startRacing(int laps) {
        for (int i = 0; i < laps; i++) {
            addDistanceInRandom();
            lapCount++;
        }
    }

    private void addDistanceInRandom() {
        if (Math.random() < 0.7) {
            distance++;
            progress += "-";
        }

        System.out.println(progress);
    }
}
