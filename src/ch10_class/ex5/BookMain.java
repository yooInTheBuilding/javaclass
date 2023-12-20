package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.bookTitle = "만들어진 신";
        Book book2 = new Book("만들어진 신", "리처드 도킨스");
        Book book3 = new Book("만들어진 신", "리처드 도킨스", "김영사", 9788934926184L, 22500 );

    }
}
