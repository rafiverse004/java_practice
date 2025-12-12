/*
Write a Java program that takes an integer number and 
prints how many digits are in that number.
*/
import java.util.Scanner;
public class task_03
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter a number:" );
        int num = scanf.nextInt();
        
        num = Math.abs(num);

        int digits = 0;

        if (num == 0)
        {
            System.out.println("0");
        }
        else
        {
            while (num > 0)
            {
                num = num / 10;
                digits++;
            }
            System.out.println("Number of digits: " + digits);
        }
        scanf.close();
    }
}