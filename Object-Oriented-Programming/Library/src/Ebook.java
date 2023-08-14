public class Ebook extends Book {
    private String format;

    Ebook(String title, String author, int pageCount, String format) {  // format is just another ebook property (pdf, doc etc...)
        super(title, author, pageCount);

        this.format = format;
    }
}