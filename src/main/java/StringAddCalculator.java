public class StringAddCalculator {

    public static int splitAndSum(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return getResultForOneLetter(s);
        }
        if (s.startsWith("//")) {
            return getFromCustomSeparator(s);
        }
        return getSeparatedNumber(s);
    }

    private static int getResultForOneLetter(String s) {
        int number = Integer.parseInt(s);
        throwErrorIfUnderZero(number);

        return number;
    }

    private static int getSeparatedNumber(String s) {
        String[] numbers = s.split("[,:]");

        return getSum(numbers);
    }

    private static int getFromCustomSeparator(String s) {
        int index = s.lastIndexOf("\n");
        String separator = String.valueOf(s.charAt(index - 1));
        String substring = s.substring(index + 1);
        String[] numbers = substring.split(separator);

        return getSum(numbers);
    }

    private static int getSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            int intNumber = Integer.parseInt(number);
            throwErrorIfUnderZero(intNumber);
            sum += intNumber;
        }

        return sum;
    }

    private static void throwErrorIfUnderZero(int number) throws RuntimeException {
        if (number < 0) {
            throw new RuntimeException();
        }
    }
}
