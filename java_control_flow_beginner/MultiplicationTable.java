import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        for(int i=1; i<=10; i++)
        {
            int multiple = num * i;
            System.out.println(num + " * " + i + " = " + multiple);
        }

        scanf.close();
    }
}