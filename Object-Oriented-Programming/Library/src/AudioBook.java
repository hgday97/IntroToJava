public class AudioBook extends Book {  // It EXTENDS book, so it still has the classic author, title etc. of the book class
    private int runTime; // How long audio book is, mins

    AudioBook(String title, String author, int runTime) { // Audio book constructor - as it extends book, we still need the properties of the book class
        super(title, author, 0);  // super calls parent class, so only include book class properties
        
        this.runTime = runTime;
    }
}
