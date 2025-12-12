// Question: Divide two numbers and print quotient and remainder

import java.util.Scanner;
public class QuotientRemainder
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanf.nextInt();

        if (num2 > 0)
        {
            int quotient = num1 / num2;
            System.out.println("Quotient = " + quotient);

            int remainder = num1 % num2;
            System.out.println("Remainder = " + remainder);
        }
        else
        {
            System.out.println("Can't devide by zero.");
        }

        scanf.close();
    }
}
