//Question: Check if a number is positive, negative, or zero using ternary operator.

import java.util.Scanner;
public class NumberSignCheck
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scanf.nextInt();

        System.out.println((num >= 0) ?  ((num > 0) ? num + " is positive." : num + " is zero.") : num + " is negative.");

        scanf.close();
    }
}