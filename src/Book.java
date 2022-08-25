public class Book {
    String bookName;
    String author;
    int publication;


    public Book(String bookName, String author, int publication) {
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublication (int publication){
        this.publication = publication;
    }
}