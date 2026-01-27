import java.util.*;

class Book {
    private final String title;
    private boolean borrowed = false;

    // Constructor
    public Book(String title) {
        this.title = title;
    }

    // This just reeds the current state of borrowed and returns it
    public boolean isBorrowed() {
        return borrowed;
    }

    // Works when someone wants to borrow a book
    public boolean borrow() {
        if (borrowed) {
            return false; // If the book is already borrowed, then 'borrow' becomes false
        } else {
            borrowed = true;
            return true; // Otherwise mark it as borrowed and 'borrow' becomse true
        }
    }

    // Works when someone wants to borrow a book
    public boolean returnBook() {
        if (!borrowed){
            return false;
        } else {
            borrowed = false;
            return true;
        }
    }

    // Getter when someone returns the book
    public String getTitle() {
        return title;
    }

    public void displayList() {
        System.out.println("Book name: " + this.title);
        System.out.println("Borrowed: " + this.borrowed);
    }
}

class InnerLibrary {

    // A dynamic list.
    private final List<Book> books = new ArrayList<>(); // new ArrayList<>() allocates an empty list.

    public void addBook(Book b) { // ddBook(Book b) tells the method exactly what type of object it must receive: a Book.
        books.add(b);
    }

    public boolean borrow(String title) {
        Book b = find(title);
        return b != null && b.borrow(); // It’s combining existence check and borrowing result in one line.
    }

    public boolean returnBook(String title) {
        Book b = find(title);
        return b != null && b.returnBook();
    }

    private Book find(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title))
                return b;
        }
        return null;
    }
    public void displayAllBooks() {
        for (Book b : books) {
            b.displayList();
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        InnerLibrary library = new InnerLibrary();

        library.addBook(new Book("A"));
        library.addBook(new Book("B"));

        System.out.println(library.borrow("A"));
        System.out.println(library.borrow("A"));
        System.out.println(library.returnBook("A"));
        System.out.println(library.returnBook("A"));

        library.displayAllBooks();
        scanf.close();
    }
}