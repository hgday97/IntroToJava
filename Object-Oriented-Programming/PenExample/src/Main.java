
public class Main {
    
    public static void main(String[] args) {
        Book lotr = new Book("LOTR", "J.R.R.Tolkien", 398);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 1000);
        Ebook jeeves = new Ebook("Carry on Jeeves", "P.G. Wodehouse", 200, "PDF");

        System.out.printf(jeeves.toString());

    }
}

