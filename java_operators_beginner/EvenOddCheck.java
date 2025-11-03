// Question: Check if a number is even or odd

import java.util.Scanner;

public class EvenOddCheck
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num1 = ");
        int num1 = scanf.nextInt();

        if(num1 % 2 == 0)
        {
            System.out.println(num1 + " is even.");
        }
        else if(num1 % 2 != 0)
        {
            System.out.println(num1 + " is odd.");            
        }
        else if(num1 == 0)
        {
            System.out.println(num1 + " is zero.");
        }

        scanf.close();
    }
}