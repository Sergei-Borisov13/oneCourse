package Objects_and_classes;

public class Book {
    private Author author;
    private String title;
    private int year;

    public Book(Author author, String title, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

