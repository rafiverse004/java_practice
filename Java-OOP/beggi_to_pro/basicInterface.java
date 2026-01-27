// Implement a basic interface Printable and a class Document that implements it.
// Interfaces, implementing contracts.

// Define the interface
interface Printable {
    void print();
}

// Implement the interface in a class
class Document implements Printable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + content);
    }
}

public class basicInterface {
    public static void main(String[] args) {
        Document doc = new Document("Hello, World!");
        doc.print();
    }
}
