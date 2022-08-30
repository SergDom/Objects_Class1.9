import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publication;

    public Book(String bookName, Author author, int publication) {
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
    }

    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublication(){
        return this.publication;
   }

    public void setPublication (int publication){
        this.publication = publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publication == book.publication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publication);
    }

    @Override
    public String toString() {
        return "Название: " + bookName + ',' + " Автор: " + getAuthor().getAuthorName() + " " + getAuthor().getAuthorLastName() + ',' + " Год публикации: " + publication;
    }

}
