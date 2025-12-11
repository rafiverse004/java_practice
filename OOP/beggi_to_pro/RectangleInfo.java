// Build a Rectangle class with methods for area/perimeter.

import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters and setters for width
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    // Getters and setters for height
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Area calculation
    public double area() {
        double area = width * height;
        return area;
    }

    // Perimeter calcultion
    public double perimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanf.nextDouble();

        System.out.print("Enter height: ");
        double height = scanf.nextDouble();

        Rectangle r1 = new Rectangle(width, height);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        scanf.close();
    }
}
