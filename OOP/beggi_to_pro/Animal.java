// Build an Animal hierarchy (abstract Animal → Dog/Cat). Add abstract methods and overrides.
// abstract classes, inheritance, abstract methods, overriding.

import java.util.Scanner;

// Abstract means incomplete.
abstract class InnerAnimal {
    protected String name;

    // Constructor.
    public InnerAnimal(String name) {
        this.name = name;
    }

    // “Declaring an abstract method tells subclasses they must implement this method.”
    public abstract void makeSound();

    // A concrete method provides shared behavior that all subclasses can use without overriding.
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Dog class
class Dog extends InnerAnimal {

    public Dog(String name) {
        super(name); // super calls the parent class’s constructor.
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Cat class
class Cat extends InnerAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        InnerAnimal dog = new Dog("Buddy");
        InnerAnimal cat = new Cat("Whiskers");

        dog.makeSound(); // Buddy says: Woof!
        cat.makeSound(); // Whiskers says: Meow!

        dog.eat();       // Buddy is eating.
        cat.eat();       // Whiskers is eating.
        

        scanf.close();
    }
}