// Question: Check if a number is between 10 and 20 using AND operator

import java.util.Scanner;
public class LogicalAndDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Enter num1 = ");
        int num1 = scanf.nextInt();

        if(num1 >= 10 && num1 <= 20)
        {
            System.out.println(num1 + " is between 10 and 20.");
        }
        else
        {
            System.out.println(num1 + " is not between 10 and 20.");
        }
        scanf.close();
    }
}
