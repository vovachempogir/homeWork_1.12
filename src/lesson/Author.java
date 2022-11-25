package lesson;

public class Author {
    private final String bookName;
    private final String author;

    public Author(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }


    public String getAuthor() {
        return this.author;
    }
}