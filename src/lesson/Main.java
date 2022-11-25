package lesson;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Author warTolstoy = new Author("Война и мир", "Толстой");
        Book warTolstoyYear = new Book(1863);
        warTolstoyYear.setPublisherYear(2010);
        System.out.println(warTolstoy.getBookName() + " " + warTolstoy.getAuthor() + " " + warTolstoyYear.getPublisherYear());
        Author daughterPushkin = new Author("Капитанская дочь", "Пушкин");
        Book daughterPushkinYear = new Book(1836);
        daughterPushkinYear.setPublisherYear(2011);
        System.out.println(daughterPushkin.getBookName() + " " + daughterPushkin.getAuthor() + " " + daughterPushkinYear.getPublisherYear());

    }
}
