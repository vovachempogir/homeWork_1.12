package lesson;

public class Main {
    public static void main(String[] args) {
        Author warTolstoy = new Author("Лев", "Толстой");
        Book warTolstoyBook = new Book("Война и мир" , warTolstoy,1863);

        Author daughterPushkin = new Author("Александр", "Пушкин");
        Book daughterPushkinBook = new Book("Капитанская дочка", daughterPushkin, 1836);

        System.out.println(warTolstoyBook);
        System.out.println(daughterPushkinBook);

        warTolstoyBook.setPublisherYear(2022);
        daughterPushkinBook.setPublisherYear(2022);

        System.out.println(warTolstoyBook);
        System.out.println(daughterPushkinBook);
        System.out.println(warTolstoyBook.equals(daughterPushkinBook));
        System.out.println(warTolstoy.equals(daughterPushkin));
    }

}
