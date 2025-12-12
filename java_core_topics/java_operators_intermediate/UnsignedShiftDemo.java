// Question: Demonstrate unsigned right shift on a negative number
import java.util.Scanner;

public class UnsignedShiftDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a negative number: ");
        int num = scanf.nextInt();

        int shifted = num >>> 1;

        System.out.println("Original number: " + num);
        System.out.println("Binary (before shift): " + Integer.toBinaryString(num));
        System.out.println("After unsigned right shift (num >>> 1): " + shifted);
        System.out.println("Binary (after shift): " + Integer.toBinaryString(shifted));

        scanf.close();
    }
}
