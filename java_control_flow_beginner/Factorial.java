import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.println(num + " ! = " + factorial);

        scanf.close();
    }
}
