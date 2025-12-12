// Question: Perform bitwise AND, OR, XOR on two numbers
import java.util.Scanner;

public class BitwiseOpsDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanf.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanf.nextInt();

        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 | num2 = " + (num1 | num2));
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));

        scanf.close();
    }
}
