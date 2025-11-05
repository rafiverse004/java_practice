import java.util.Scanner;

public class LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a num1: ");
        int num1 = scanf.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = scanf.nextInt();

        System.out.print("Enter a num3: ");
        int num3 = scanf.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is largest.");
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println(num2 + " is largest.");
        }
        else
        {
            System.out.println(num3 + " is largest.");
        }
        scanf.close();
    }
}
