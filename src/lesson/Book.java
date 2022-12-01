package lesson;

import java.time.LocalDate;
import java.util.Objects;

public class Book {

    private final String bookName;
    private final Author author;
    private int publisherYear;


    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }


    public void setPublisherYear(int publisherYear) {
        int currentYear = LocalDate.now().getYear();
        if (publisherYear < 1800 || publisherYear > currentYear) {
            System.out.println("Недопустимый параметр года публикации: " + publisherYear);
            return;
        }
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Название книги-" + this.bookName + " Автор-" + this.author + " год издания-" + this.publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equalsIgnoreCase(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

}


