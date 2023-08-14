public class Book {
    public String title;
    public String author;
    private int pageCount;

    Book(String title, String author, int pageCount) {  // Book constructor
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}
