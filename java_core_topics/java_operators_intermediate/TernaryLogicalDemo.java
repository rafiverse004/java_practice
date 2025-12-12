// Question: Use ternary operator with logical conditions

import java.util.Scanner;

public class TernaryLogicalDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanf.nextInt();

        System.out.print("Enter second number: ");
        int b = scanf.nextInt();

        String result = (a > 0 && b > 0) ? "Valid" : "Invalid";
        System.out.println(result);
        scanf.close();
    }
}
