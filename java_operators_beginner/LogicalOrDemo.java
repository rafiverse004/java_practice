// Question: Check if a number is less than 10 or greater than 100

import java.util.Scanner;
public class LogicalOrDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Enter num1 = ");
        int num1 = scanf.nextInt();

        if(num1 < 10 || num1 > 100)
        {
            System.out.println(num1 + " is less than 10 or greater than 100.");
        }
        else
        {
            System.out.println(num1 + " is not less than 10 or greater than 100.");
        }
        scanf.close();
    }
}
