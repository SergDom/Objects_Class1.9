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
    public boolean equals(Object otherName) {
        if (this.bookName != bookName) {
            return false;}
        Book bookCompare = (Book) otherName;
        return bookName.equals(bookCompare.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Название: " + bookName + ',' + " Автор: " + getAuthor().getAuthorName() + " " + getAuthor().getAuthorLastName() + ',' + " Год публикации: " + publication;
    }
}