/*
Write a Java program that takes a number as input from the user and
tells if it is a perfect number or not.
Perfect Number: An integer number is said to be a perfect number if its factors,
including 1 but not the number itself, sum to the number.
*/
import java.util.Scanner;
public class task_06
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanf.nextInt();

        int sum = 0;
        for (int i=1 ; i<=num/2; i++)
        {
            if(num%i == 0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is not a perfect number.");
        }

        scanf.close();
    }   
}
