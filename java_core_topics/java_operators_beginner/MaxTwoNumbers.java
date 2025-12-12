// Question: Find the larger of two numbers using ternary operator

import java.util.Scanner;
public class MaxTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanf.nextInt();

        System.out.println((num1 > num2) ?  num1 + " is largest." : num2 + " is largest.");

        scanf.close();
    }
}