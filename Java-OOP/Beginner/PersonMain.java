/*
PROBLEM 1:
Create a Person class with:
- private fields
- a constructor
- getters and setters
*/

// WHAT YOU ARE LEARNING:
// Encapsulation, Constructor, Getters and Setters

// Person class demonstrates encapsulation
class Person {

    // Private fields: direct access from outside is NOT allowed
    private String name;
    private int age;

    // Constructor: forces object to be created with valid initial data
    public Person(String name, int age) {
        this.name = name;   // 'this' refers to current object
        this.age = age;
    }

    // Getter: controlled read access to name
    public String getName() {
        return name;
    }

    // Setter: controlled write access to name
    public void setName(String name) {
        this.name = name;
    }

    // Getter: controlled read access to age
    public int getAge() {
        return age;
    }

    // Setter: controlled write access to age
    public void setAge(int age) {
        this.age = age;
    }
}

// Main class comes LAST
public class PersonMain {

    public static void main(String[] args) {

        // Creating a Person object using the constructor
        Person person = new Person("Alice", 25);

        // Reading private data using getters
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // Modifying private data using setters
        person.setName("Bob");
        person.setAge(30);

        // Reading updated values
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}