//Check if a number is postive, negative, or zero.

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        if(num > 0)
        {
            System.out.println("Positive.");
        }
        else if(num < 0)
        {
            System.out.println("Negative.");
        }
        else
        {
            System.out.println("Zero.");
        }
        scanf.close();
    }
}