/*
Write a Java program that takes a number as input from the user and
prints the divisors of that number as well as how many divisors the number has.
*/
import java.util.Scanner;
public class task_05
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
                System.out.println(i);
            }
        }
        System.out.println("Total divisors: " + count);

        scanf.close();
    }   
}
