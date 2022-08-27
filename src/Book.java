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

}