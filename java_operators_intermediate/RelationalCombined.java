// Question: Combine relational operators to check multiple conditions

import java.util.Scanner;

public class RelationalCombined
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanf.nextInt();

        System.out.print("Enter second number: ");
        int b = scanf.nextInt();

        boolean result = (a > 0 && b < 0) || (a < 0 && b > 0);

        System.out.println("Condition (one positive, one negative): " + result);
        scanf.close();
    }
}
