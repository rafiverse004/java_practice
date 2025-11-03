/*
Print length and width and find area and perimeter of a rectangle.
*/

public class RectangleCalculator {
    public static void main(String[] args) 
    {
        int length = 5;
        int width = 3;

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
