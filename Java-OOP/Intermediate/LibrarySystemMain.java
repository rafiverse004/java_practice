/*
PROBLEM 7:
Implement a Library system:
- Library holds a list of Book objects (composition)
- Add borrow and return logic
*/

// WHAT YOU ARE LEARNING:
// Composition, Encapsulation, List Manipulation, Method Logic

import java.util.ArrayList;
import java.util.List;

// Book class → simple model
class Book {

    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed = true;
    }

    public void returned() {
        borrowed = false;
    }
}

// Library class → has a list of books
class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Borrow a book by title
    public void borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title) && !b.isBorrowed()) {
                b.borrow();
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    // Return a book by title
    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title) && b.isBorrowed()) {
                b.returned();
                System.out.println("You returned: " + title);
                return;
            }
        }
        System.out.println("Book was not borrowed: " + title);
    }
}

// Main class comes last
public class LibrarySystemMain {

    public static void main(String[] args) {

        Library library = new Library();

        // Create and add books
        Book book1 = new Book("1984");
        Book book2 = new Book("Brave New World");
        library.addBook(book1);
        library.addBook(book2);

        // Borrow books
        library.borrowBook("1984");
        library.borrowBook("1984"); // Already borrowed

        // Return books
        library.returnBook("1984");
        library.returnBook("The Alchemist"); // Not borrowed
    }
}
