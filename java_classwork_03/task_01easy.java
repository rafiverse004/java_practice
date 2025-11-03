/*
Write a Java program that asks the user for a quantity,
then takes that many numbers as input and prints
the maximum, minimum and average of those numbers.
 */
import java.util.Scanner;
public class task_01easy
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int max=0;
        int min=0;
        int sum=0;
        float average=0;

        System.out.println("Enter quantity: ");
        int quantity = scanf.nextInt();

        System.out.println("Enter " + quantity + " numbers: ");
        for (int i=0; i<quantity; i++)
        {
            int num = scanf.nextInt();
            if(num==0)
            {
                max = num;
                min = num;
            }
            else if(num < max)
            {
                max = num;
            }
            else if(num > min)
            {
                min = num;
            }
            sum += num;
        }
        average = (float)sum/quantity;

        System.out.println("Maximum = " + max + " Minimum = " + min + " Average = " + average);

        scanf.close();
    }
}
