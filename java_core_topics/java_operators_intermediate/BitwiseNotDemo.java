// Question: Demonstrate bitwise NOT operator
import java.util.Scanner;

public class BitwiseNotDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        int result = ~num;

        System.out.println("Original number: " + num);
        System.out.println("After bitwise NOT (~num): " + result);
        System.out.println("Binary before: " + Integer.toBinaryString(num));
        System.out.println("Binary after : " + Integer.toBinaryString(result));

        scanf.close();
    }
}
