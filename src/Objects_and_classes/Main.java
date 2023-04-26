package Objects_and_classes;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Гоголь");
        Book book1 = new Book(author2, "Мёртвые души", 1842);
        Book book2 = new Book(author1, "Война и мир", 1873);
        book2.setYear(1841);
        System.out.println(book1);
        System.out.println(book2);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else System.out.println("Книги разные");
        if (author1.equals(author2)) {
            System.out.println("Авторы одинаковые");
        } else System.out.println("Авторы разные");

    }
}
