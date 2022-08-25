public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Носов");

        Book book1 = new Book("Низнайка на Луне", author1.toString(), 1965);

        System.out.println(book1.bookName + " " + book1.author + " " + book1.publication);

    }
}