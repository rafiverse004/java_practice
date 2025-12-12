// Question: Reverse a boolean condition using NOT operator

import java.util.Scanner;

public class LogicalNotDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        // Using logical NOT (!) to reverse the value
        boolean reversed = !value;

        System.out.println("Original value: " + value);
        System.out.println("Reversed value: " + reversed);

        sc.close();
    }
}
