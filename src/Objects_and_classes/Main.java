package Objects_and_classes;

public class Main {


    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Лев", "Тлстой");
        Author authorDeadSouls = new Author("Николай", "Гоголь");
        Book deadSouls = new Book(authorDeadSouls, "Мёртвые души", 1842);
        Book warAndPeace = new Book(authorWarAndPeace, "Война и мир", 1873);
        warAndPeace.setYear(1961);
        System.out.println("Автор - " + warAndPeace.getAuthor().getName() + " " +  warAndPeace.getAuthor().getFirstName());
        System.out.println("Название - " + warAndPeace.getTitle());
        System.out.println("Год издания - " + warAndPeace.getYear());
        System.out.println("Автор - " + deadSouls.getAuthor().getName() + " " + deadSouls.getAuthor().getFirstName());
        System.out.println("deadSouls.getTitle() = " + deadSouls.getTitle());
        System.out.println("Год издания - " + deadSouls.getYear());
    }
}
