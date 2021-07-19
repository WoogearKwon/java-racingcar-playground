package racing;

public class Name {
    private final String name;

    public Name(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Car name cannot be blank");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("Car name should be within 5 letters");
        }

        this.name = name;
    }
}
