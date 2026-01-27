public class Tester_or_Driver {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Add books
        Book book1 = new Book(101, "Java Basics", "John Smith", true);
        Book book2 = new Book(102, "Data Structures", "Jane Doe", true);
        Book book3 = new Book(103, "Algorithms", "Alice Johnson", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Add users
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        library.addUser(user1);
        library.addUser(user2);

        // Borrow a book
        System.out.println("Alice tries to borrow 'Java Basics':");
        user1.borrowBook(book1);

        // Search for a user
        System.out.println("\nSearching for user 'Alice':");
        User foundUser = library.searchUser("Alice");
        if (foundUser != null) {
            foundUser.printDetails();
        } else {
            System.out.println("User not found");
        }

        System.out.println("\nSearching for user 'Charlie':");
        User notfoundUser = library.searchUser("Alice");
        if (notfoundUser != null) {
            notfoundUser.printDetails();
        } else {
            System.out.println("User not found");
        }

        // Search for a book
        System.out.println("\nSearching for book 'Data Structures':");
        Book foundBook = library.searchBook("Data Structures");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor() +
                               " | Available: " + foundBook.isAvailable());
        } else {
            System.out.println("Book not found");
        }

        // Borrow another book
        System.out.println("\nBob tries to borrow 'Java Basics':");
        user2.borrowBook(book1);  // should say "not available"

        // Return a book
        System.out.println("\nAlice returns 'Java Basics':");
        user1.returnBook(book1);

        // Bob tries again
        System.out.println("\nBob tries to borrow 'Java Basics' again:");
        user2.borrowBook(book1);

        // Print all borrowed books for Bob
        System.out.println("\nBob's borrowed books:");
        user2.printDetails();
    }
}
