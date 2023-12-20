package ch10_class.ex5;

public class Book {
    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    long  isbn;
    int bookPrice;

    public Book(){

    }
    public Book(String bookTitle, String bookAuthor){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public Book(String bookTitle, String bookAuthor, String bookPublisher, long isbn, int bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.isbn = isbn;
        this.bookPrice = bookPrice;
    }

}
