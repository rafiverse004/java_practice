// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        System.out.println("Name: " + p1.name + ", Age: " + p1.age);
        System.out.println("Name: " + p2.name + ", Age: " + p2.age);
    }
}