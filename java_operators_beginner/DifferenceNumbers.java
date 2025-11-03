// Question: Find the difference between two numbers

import java.util.Scanner;
public class DifferenceNumbers
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanf.nextInt();

        int difference = num1 - num2;
        System.out.println("Difference = " + difference);

        scanf.close();
    }
}
