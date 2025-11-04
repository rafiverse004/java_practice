// Question: Demonstrate logical AND, OR, and NOT operators

import java.util.Scanner;

public class LogicalOpsDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanf.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanf.nextBoolean();

        System.out.print("Enter third boolean value (true/false): ");
        boolean c = scanf.nextBoolean();

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
        System.out.println("(a && b) || c = " + ((a && b) || c));

        scanf.close();
    }
}
