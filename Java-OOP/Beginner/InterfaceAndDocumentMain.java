/*
PROBLEM 5:
Implement a basic interface Printable and a class Document that implements it
*/

// WHAT YOU ARE LEARNING:
// Interfaces, Polymorphism, Method Implementation

// Define interface → contract for classes
interface Printable {

    // Method all implementing classes must define
    void print();
}

// Document class implements Printable
class Document implements Printable {

    private String text; // content of the document

    // Constructor → initializes document content
    public Document(String text) {
        this.text = text;
    }

    // Implement print() from Printable
    @Override
    public void print() {
        System.out.println("Printing Document: " + text);
    }
}

// Main class comes last
public class InterfaceAndDocumentMain {

    public static void main(String[] args) {

        // Create Document object
        Printable doc = new Document("Hello, OOP World!");

        // Call interface method → polymorphism
        doc.print();
    }
}
