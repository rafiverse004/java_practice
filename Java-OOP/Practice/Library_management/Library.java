import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books= new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public Book searchBook(String title){
        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public User searchUser(String name){
        for(User u : users){
            if(u.getName().equalsIgnoreCase(name)){
                return u;
            }
        }
        return null;
    }
}
