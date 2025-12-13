public class Tester {
  public static void main(String[] args) {
    Library l1 = new Library("Central Library");
    
    Book b1 = new Book("Clean Code", "Robert Martin");
    Book b2 = new Book("Java Basics", "James Gosling");
    
    l1.addBook(b1);
    l1.addBook(b2);
    
    l1.display();
  }
}
// You must figure out:

// How many classes?

// What constructors are needed?

// What variables are required?

// What methods must exist?

// Which class holds references to which?