// Question: Print multiplication table from 1 to N in a grid
// Description: Input N. Print a table from 1×1 to N×N in a matrix format.

import java.util.Scanner;

public class MultiplicationGrid
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= num; j++)
            {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        scanf.close();
    }
}