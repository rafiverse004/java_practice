// Question: Calculate sum of first N natural numbers 

import java.util.Scanner;
public class SumOf1toN
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        scanf.close();
    }
}
