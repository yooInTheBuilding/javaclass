package ch10_class.ex7;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookTitle("책제목");
        System.out.println(book.getBookTitle());
    }
}