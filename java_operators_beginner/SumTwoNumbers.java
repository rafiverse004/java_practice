// Question: Add two numbers entered by the user

import java.util.Scanner;
public class SumTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanf.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        scanf.close();
    }
}