/*
PROBLEM 3:
Create a Student class and override the toString() method
*/

// WHAT YOU ARE LEARNING:
// Method Overriding, Object Class, Polymorphism Basics

class Student {

    // Private fields → encapsulation
    private String name;
    private int age;
    private String major;

    // Constructor → initializes object state
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Overriding toString() from Object class
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}

// Main class comes last
public class StudentMain {

    public static void main(String[] args) {

        // Creating Student object
        Student student = new Student("Alice", 21, "Computer Science");

        // toString() is called automatically by println
        System.out.println(student);
    }
}
