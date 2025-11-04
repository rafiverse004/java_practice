// Question: Combine bitwise shift with arithmetic operations

import java.util.Scanner;

public class ShiftArithmetic
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanf.nextInt();

        int result = (number << 2) + (number >> 1); // multiply by 4 + divide by 2
        System.out.println("Result of (number << 2) + (number >> 1): " + result);
        scanf.close();
    }
}
