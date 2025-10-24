/*
Question:
Write a Java program to read the radius of a circle and calculate its area and circumference.
*/

import java.util.Scanner;
public class task_02
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = scanf.nextFloat();

        float pie = 3.1416f;
        float area = pie * radius * radius;
        float circumference = 2 * pie * radius;

        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circumference);

        scanf.close();
    }
}