// Question: Separate sum of even and odd numbers from user input

import java.util.Scanner;

public class SumEvenOdd
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        int sumofeven = 0;
        int sumofodd = 0;

        for(int i=1; i<=num; i++)
        {
            if(i % 2 == 0)
            {
                sumofeven += i;
            }
            else
            {
                sumofodd += i;
            }
        }
        System.out.println("Sum of even number 1 to " + num + " = " + sumofeven);
        System.out.println("Sum of odd number 1 to " + num + " = " + sumofodd);

        scanf.close();
    }
}