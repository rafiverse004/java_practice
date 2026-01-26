import java.util.List;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>(); // Empty User info
    }

    public void borrowBook(Book book){
        if(book.isAvailable()){
            book.borrow();
            borrowedBooks.add(book);
        } else {
            System.out.println("This books is not available.");
        }
    }
    public void returnBook(Book book){
        if(borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("This book was not borrowed by this user.");
        }
    }

    // Getter to see list of how many book the user have borrowed
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println(getBorrowedBooks());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Borrowed: " + borrowedBooks;
    }
}
