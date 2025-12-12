//Check a number is even or odd.

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Even.");
        }
        else
        {
            System.out.println("Odd.");
        }
        scanf.close();
    }
}
