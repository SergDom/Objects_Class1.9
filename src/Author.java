public class Author {
    String authorName;
    String authorLastName;

    public Author (String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorName(){
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}
