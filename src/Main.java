
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Носов");
        Author author2 = new Author("Маргарет", "Митчелл");

        Book book1 = new Book("Незнайка на Луне", author1, 1965);
        Book bookCompare1 = new Book("Незнайка в солнечном городе", author1, 1965);

        Book book2 = new Book("Унесённые ветром", author2, 1936);
        Book bookCompare2 = new Book("Унесённые снегом", author2, 1936);
        System.out.println(book1);
        System.out.println(book1.hashCode());
        book1.setPublication(2022);
        System.out.println(book1);
        System.out.println(book1.hashCode());
        System.out.println(book1.equals(bookCompare1));

        System.out.println();

        System.out.println(book2);
        System.out.println(book2.hashCode());
        book2.setPublication(2000);
        System.out.println(book2);
        System.out.println(book2.hashCode());
        System.out.println(book2.equals(bookCompare2));

    }
}