// Always build the class that does not depend on others first. Then build classes that reference it.

public class Book {
    public String title;
    public String writerName;

    // Constructor
    public Book(String title, String writerName){
        this.title = title;
        this.writerName = writerName;
    }
}
