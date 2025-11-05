import java.util.Scanner;

public class PrimeCheck
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        if (num <= 1)
        {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanf.close();
    }
}
