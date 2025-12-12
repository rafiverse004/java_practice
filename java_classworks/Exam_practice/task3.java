// Write a Java program that reads the radius of a circle and prints its circumference and area.

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanf.nextDouble();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.printf("Circumference = %.2f\n", circumference);
        System.out.printf("Area = %.2f\n", area);

        scanf.close();
    }
}