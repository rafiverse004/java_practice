// Question: Swap two numbers using bitwise XOR without a third variable
import java.util.Scanner;

public class SwapXORDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanf.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanf.nextInt();

        System.out.println("\nBefore swap:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a + ", b = " + b);

        scanf.close();
    }
}
