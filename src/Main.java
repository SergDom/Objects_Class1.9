import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Носов");
        Author author2 = new Author("Маргарет", "Митчелл");

        Book book1 = new Book("Низнайка на Луне", author1, 1965);
        Book book2 = new Book("Унесённые ветром", author2, 1936);
        System.out.println(book1.getBookName() + " " + author1.getAuthorName() + " " + author1.getAuthorLastName() + " " + book1.getPublication());
        book1.setPublication(2022);
        System.out.println(book1.getBookName() + " " + author1.getAuthorName() + " " + author1.getAuthorLastName() + " " + book1.getPublication());

        System.out.println();

        System.out.println(book2.getBookName() + " " + author2.getAuthorName() + " " + author2.getAuthorLastName() + " " + book2.getPublication());
        book2.setPublication(2000);
        System.out.println(book2.getBookName() + " " + author2.getAuthorName() + " " + author2.getAuthorLastName() + " " + book2.getPublication());


    }
}