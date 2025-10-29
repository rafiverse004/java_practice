/*
Write a Java program that asks the user for one number and
tells if it is a prime number or not.
 */
import java.util.Scanner;
public class task_07
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanf.nextInt();

        int count = 0;
        for (int i=1 ; i<=num; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }

        scanf.close();
    }   
}
