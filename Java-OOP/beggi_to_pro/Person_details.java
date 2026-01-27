// Create a Person class with private fields, getters/setters, and a constructor.
// Encapsulation (private fields, getters/setters), constructors.

import java.util.Scanner;

class Person {
    // Making fields private forces all access to go through getters and setters,
    // which gives you control over what values are read or written.
    private String name; // Encapsulation - using private.
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    // Name getter
    public String getName(){
        return name;
    }
    // Name setter.
    public void setName(String name){
        this.name = name;
    }

    // Age getter.
    public int getAge(){
        return age;
    }
    // Age setter.
    public void setAge(int age){
        this.age = age;
    }
}

public class Person_details {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Person p1 = new Person("Rafik", 21);
        Person p2 = new Person(null, 0);

        // Using getters.
        System.out.println("First person: ");
        System.out.println(p1.getName());
        System.out.println(p1.getAge() + "\n");

        System.out.println("Second person: ");
        System.out.println(p2.getName());
        System.out.println(p2.getAge() + "\n");

        // Giving 2nd person name and age.
        // Using setters.
        p2.setName("Rafikul Islam");
        p2.setAge(20);

        System.out.println("Second person(updated): ");
        System.out.println(p2.getName());
        System.out.println(p2.getAge() + "\n");
        
        scanf.close();
    }
}