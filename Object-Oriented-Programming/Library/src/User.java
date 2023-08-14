import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthDate;
    private ArrayList<Book> books = new ArrayList<Book>(); // Note this is private!

    User(String name, String birthDate) {  // User Constructor
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public void borrow(Book book) { // Remember, void means nothing is returned
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDate, LocalDate.now()).getYears();

        return age;
    }
}
