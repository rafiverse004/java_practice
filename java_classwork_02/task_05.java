/*
Question:
Write a Java program to read an integer and check whether it is zero, even, or odd.
*/

import java.util.Scanner;
public class task_05
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scanf.nextInt();

        if(num == 0)
        {
            System.out.println("The number is zero.");
        }
        else if(num %2 == 0)
        {
            System.out.println("The number is even.");
        }
        else if(num % 2 != 0)
        {
            System.out.println("The number is odd.");
        }
        else
        {
            System.out.println("Invalid number.");
        }
        scanf.close();
    }
}