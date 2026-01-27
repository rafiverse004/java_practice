/*
PROBLEM 6:
Build an Animal hierarchy:
- Abstract Animal class
- Dog and Cat subclasses
- Abstract methods and method overriding
*/

// WHAT YOU ARE LEARNING:
// Abstract Classes, Inheritance, Method Overriding, Polymorphism

// Abstract base class → cannot be instantiated directly
abstract class Animal {

    // Abstract method → must be implemented by subclasses
    abstract void makeSound();

    // Concrete method → optional for subclasses to use
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog subclass → inherits Animal
class Dog extends Animal {

    // Must implement abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

// Cat subclass → inherits Animal
class Cat extends Animal {

    // Must implement abstract method
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

// Main class comes last
public class AnimalHierarchyMain {

    public static void main(String[] args) {

        // Polymorphic references
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call overridden methods
        dog.makeSound(); // Dog-specific sound
        dog.eat();       // inherited concrete method

        cat.makeSound(); // Cat-specific sound
        cat.eat();       // inherited concrete method
    }
}
