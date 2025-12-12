// Shape interface
interface Shape {
    double area();
}

// Circle class implementing Shape
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

// Square class implementing Shape
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

// Rectangle class implementing Shape
class rectangle implements Shape {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Main class
public class diffShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new rectangle(10, 5);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
