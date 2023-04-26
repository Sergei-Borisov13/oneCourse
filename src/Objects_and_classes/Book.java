package Objects_and_classes;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String title;
    private int year;

    public Book(Author author, String title, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Автор - " + author + ", Название - " + title + ", Год издания - " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(year, title, author);
    }
}

