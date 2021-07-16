package racingcar;

public class Car {
    private final String name;
    private String lap;

    public Car(String name) {
        this.name = name;
        this.lap = "";
    }

    String getName() {
        return name;
    }

    public int getLapCount() {
        return lap.length();
    }

    public void progressOneLap() {
        lap += "-";
    }

    public void startRacing() {
        addDistanceInRandom();
    }

    private void addDistanceInRandom() {
        if (Math.random() < 0.7) {
            progressOneLap();
        }

        ResultView.printProgress(name, lap);
    }
}
