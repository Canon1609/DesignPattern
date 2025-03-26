package iuh.fit;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();
        Library library2 = Library.getInstance();

        Book book1 = new Book("Design Patterns", "Gang of Four");

        library.addBook(book1);
        library2.addBook(new Book("Clean Code", "Robert C. Martin"));

        System.out.println("Library 1 books: ");
        library.getBooks().forEach(System.out::println);

        System.out.println("Library 2 books: ");
        library2.getBooks().forEach(System.out::println);


    }
}