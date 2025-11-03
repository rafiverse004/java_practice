/*
Problem: Swap Two Numbers
Take two numbers from the user and swap their values.
*/
import java.util.Scanner;
public class SwapNumbers 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Enter num1 : ");
        int num1 = scanf.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scanf.nextInt();

        int newnum1 = num2;
        int newnum2 = num1;

        System.out.println("Num1 = " + num1);
        System.out.println("New num1 = " + newnum1);
        System.out.println("Num2 = " + num2);
        System.out.println("New number2 = " + newnum2);

        scanf.close();
    }
}
