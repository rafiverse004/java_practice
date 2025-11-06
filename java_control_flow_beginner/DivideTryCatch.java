// Question: Handle division by zero using try-catch 
// Topics: try-catch-finally, exception handling

import java.util.Scanner;

public class DivideTryCatch
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = scanf.nextInt();
        System.out.print("Enter number 2");
        int num2 = scanf.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation finished");
        }
        
        scanf.close();
    }
}
