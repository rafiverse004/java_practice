// Question: Multiply and divide a number by 2 using shift operators
import java.util.Scanner;

public class ShiftOperatorsDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        int multiplied = num << 1; // Multiply by 2
        int divided = num >> 1;    // Divide by 2

        System.out.println("Original number: " + num);
        System.out.println("After left shift (num << 1), multiplied by 2: " + multiplied);
        System.out.println("After right shift (num >> 1), divided by 2: " + divided);
        
        scanf.close();
    }
}
