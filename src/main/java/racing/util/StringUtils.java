package racing.util;

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

    public static boolean hasNotThreeNames(String input) {
        String[] names = input.split(",");
        return names.length != 3;
    }
}
