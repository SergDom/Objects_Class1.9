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
        return this.bookName;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPublication(){
        return this.publication;
   }
    public void setPublication (int publication){
        this.publication = publication;
    }

}