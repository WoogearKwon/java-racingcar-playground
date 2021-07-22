package racing;

public class Name {
    private final String name;

    public Name(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name should not be blank");
        }

        if (StringUtils.isMoreThanFiveLetters(name)) {
            throw new IllegalArgumentException("Name should be less than or equal to five letters");
        }

        this.name = name;
    }
}
