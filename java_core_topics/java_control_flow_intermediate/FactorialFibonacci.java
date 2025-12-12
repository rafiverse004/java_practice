// Question: User chooses between factorial or Fibonacci series
// Topics: switch-case, loops, nested loops, user input
// Description: User inputs choice: 1 → Factorial, 2 → Fibonacci.
// Input number N and print the result according to choice.

import java.util.Scanner;

public class FactorialFibonacci
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci Series");
        System.out.print("Enter your choice: ");
        int choice = scanf.nextInt();

        switch (choice)
        {
            case 1:
                // Factorial
                System.out.print("Enter a number: ");
                int n = scanf.nextInt();
                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + n + " = " + factorial);
                break;

            case 2:
                // Fibonacci Series
                System.out.print("Enter number of terms: ");
                int terms = scanf.nextInt();
                int a = 0, b = 1, c;

                System.out.print("Fibonacci Series: ");
                for (int i = 1; i <= terms; i++) {
                    System.out.print(a + " ");
                    c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanf.close();
    }
}
