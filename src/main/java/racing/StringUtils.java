package racing;

public class StringUtils {

    public static boolean isBlank(String s) {
        if (s == null) {
            return true;
        }

        return s.isEmpty();
    }

    public static boolean isMoreThanFiveLetters(String s) {
        return s.length() > 5;
    }
}
