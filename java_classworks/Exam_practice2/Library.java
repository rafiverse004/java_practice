import java.util.ArrayList;

public class Library {
    public String libraryName;

    // Constructor.
    public Library(String libraryName){
        this.libraryName = libraryName;
    }

    // Creating dynamic list to store Books details.
    public ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void display() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in the library:");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Title: " + bookList.get(i).title);
            System.out.println("Writer: " + bookList.get(i).writerName);
        }
    }
}
