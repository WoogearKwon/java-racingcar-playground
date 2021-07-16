package racingcar;

public class ResultView {

    static void printProgress(String name, String progress) {
        println(name + " : " + progress);
    }

    static void printWinners(String name) {
        println(name + "가 최종 우승했습니다.");
    }

    static private void println(String s) {
        System.out.println(s);
    }
}
