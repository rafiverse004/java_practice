/*
Problem: Operations Practice
Write a Java program that:
1. Asks the user to enter two numbers.
2. Calculates the sum, difference, product, and quotient of the two numbers.
3. Prints the results in a readable format.
Example output:
Enter first number: 10
Enter second number: 5
Sum: 15
Difference: 5
Product: 50
Quotient: 2
*/

import java.util.Scanner;
public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanf.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanf.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        float quotient = 0;
        if (num2 != 0)
        {
            quotient = (float)num1 / num2;
        }
        else
        {
            System.out.println("Can't be divided by zero.");
        }
        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);

        scanf.close();
        }
}