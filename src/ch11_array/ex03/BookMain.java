package ch11_array.ex03;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
       // book1.setId(1L);
        book1.setBookTitle("T1");
        book1.setBookAuthor("A1");
        book1.setBookPrice("P1");
        book1.setBookPublisher("Pub1");
        bookList.add(book1);
        Book book2 = new Book("T2", "A2", "P2", "Pub2");
        bookList.add(book2);
        for (int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i).getId());
            System.out.println(bookList.get(i).getBookTitle());
            System.out.println(bookList.get(i).getBookAuthor());
            System.out.println(bookList.get(i).getBookPrice());
            System.out.println(bookList.get(i).getBookPublisher());
        }
    }
}
