/*

1. Core Classes

    Book:

        id, title, author, isAvailable

        Methods: borrow(), returnBook()

    User:

        id, name, borrowedBooks (list of Books)

        Methods: borrowBook(Book), returnBook(Book)

    Library:

        books (list), users (list)

        Methods: addBook(Book), removeBook(Book), searchBook(String title), registerUser(User)

2. Relationships

    Library contains books and users.

    User borrows books (track in a list).

    Avoid complex transaction classes for now; just update book availability and user’s borrowedBooks list.

3. Basic OOP Concepts to Use

    Encapsulation: Keep fields private, use getters/setters.

    Simple Inheritance: Optional: Admin extends User for adding/removing books.

    Polymorphism: Not necessary unless you want different borrowing limits.

    Composition: Library has lists of books and users.

4. Features to Implement

    Add/remove books (admin).

    Register users.

    Borrow/return books (update book availability & user list).

    Search books by title or author.

    Optional: track simple due date (string or LocalDate).

*/