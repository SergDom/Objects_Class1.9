public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Носов");

        Book book1 = new Book("Низнайка на Луне", author1, 1965);

        System.out.println(book1.getBookName() + " " + book1.author + " " + book1.getPublication());
        book1.setPublication(2022);
        System.out.println(book1.getBookName() + " " + book1.getAuthor() + " " + book1.getPublication());


    }
}