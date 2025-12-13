/*
PROBLEM 4:
Build a Rectangle class with methods to calculate:
- area
- perimeter
*/

// WHAT YOU ARE LEARNING:
// Method Design, Encapsulation, Basic Mathematics in OOP

class Rectangle {

    // Private fields → dimensions are protected
    private double width;
    private double height;

    // Constructor → initializes rectangle dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method → calculates area
    public double area() {
        return width * height;
    }

    // Method → calculates perimeter
    public double perimeter() {
        return 2 * (width + height);
    }
}

// Main class comes last
public class RectangleMain {

    public static void main(String[] args) {

        // Create Rectangle object
        Rectangle rect = new Rectangle(5, 3);

        // Call behavior methods
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
