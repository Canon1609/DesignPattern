package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static Library getInstance() {
        if(instance == null) {
            synchronized (Library.class){
                if(instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;


    }

    //add book to library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library");
    }

    //remove book from library
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed from library");
    }

    //get all books from library
    public List<Book> getBooks() {
        return books;
    }
}
