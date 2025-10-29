/*
Write a Java program which takes an integer number and 
prints the digits from the unit place,
then the tenth, then hundredth, etc. (Right to Left)
*/
import java.util.Scanner;
public class task_02
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter a number:" );
        int num = scanf.nextInt();
        
        num = Math.abs(num);

        System.out.println("Digits from right to left:");

        if (num == 0)
        {
            System.out.println("0");
        }
        else
        {
            while (num > 0)
            {
                int digits = num % 10;
                System.out.println(digits);
                num = num / 10;
            }
        }
        scanf.close();
    }
}