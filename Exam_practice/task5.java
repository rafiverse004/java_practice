// Write the Java code of a program that reads a 4-digit number from the user.
// Print the sum of the last 2 digits of that number.

import java.util.Scanner;
public class task5
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = scanf.nextInt();

        int lastDigit = num % 10;

        int secondlastDigit = (num / 10) % 10;

        int sum = lastDigit + secondlastDigit;
        System.out.println("Sum of last two digit : " + sum);

        scanf.close();
    }
}