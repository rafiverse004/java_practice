class Person {

    // Instance variables
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    // Constructor overloading
    Person(String name) {
        this.name = name;
        this.age = 0; // default age
    }

    // Instance method
    void introduce() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method overloading
    void setInfo(String name) {
        this.name = name;
    }

    void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class practice {

    // Demonstrate reference passing
    static void modifyPerson(Person p) {
        p.age = 99;          // changes object state (visible outside)
        p = new Person("X"); // reassigning reference (NOT visible outside)
    }

    public static void main(String[] args) {

        // Object creation (instance)
        Person p1 = new Person("Alice", 20);  // uses first constructor
        Person p2 = new Person("Bob");        // uses overloaded constructor

        // Instance method calls
        p1.introduce();
        p2.introduce();

        // Method overloading
        p1.setInfo("Alice Updated");
        p1.setInfo("Alice Final", 25);

        // Reference passing behavior
        modifyPerson(p1);

        // p1.age is 99 because we mutated the object
        // but p1 is NOT replaced by the new Person("X")
        p1.introduce();
    }
}
