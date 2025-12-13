/*
PROBLEM 8:
Create a Shape interface and implement classes:
- Circle
- Square
- Polymorphic area calculations
*/

// WHAT YOU ARE LEARNING:
// Interfaces, Polymorphism, Method Implementation, Encapsulation

// Shape interface → contract for all shapes
interface Shape {

    // Every shape must implement area calculation
    double area();
}

// Circle class → implements Shape
class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Square class → implements Shape
class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// Main class comes last
public class ShapeInterfaceMain {

    public static void main(String[] args) {

        // Polymorphic references
        Shape circle = new Circle(3);
        Shape square = new Square(4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
    }
}
