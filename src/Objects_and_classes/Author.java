package Objects_and_classes;

import java.util.Objects;

public record Author(String name, String firstName) {

    public String toString() {
        return name + " " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, firstName);
    }
}
