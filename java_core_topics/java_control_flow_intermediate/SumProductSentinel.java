// Question: Keep reading numbers until -1, print sum and product
// Description: Keep reading integers until -1.
// Calculate sum and product of all numbers (excluding -1).

import java.util.Scanner;

public class SumProductSentinel
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        int num;
        int sum = 0;
        long product = 1;

        System.out.println("Enter numbers (enter -1 to stop):");

        do
        {
            System.out.print("Enter a number: ");
            num = scanf.nextInt();

            if (num == -1)
            {
                break;
            }

            sum += num;
            product *= num;

        } while (true);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        scanf.close();
    }
}
