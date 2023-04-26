package Objects_and_classes;

public record Author(String name, String firstName) {

    public String toString() {
        return name + " " + firstName;
    }

}
