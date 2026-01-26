public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
        } else {
            System.out.println("This book is not available.");
        }
    }
    public void returnBook(){
        isAvailable = true;
    }

    // Getter
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
}
