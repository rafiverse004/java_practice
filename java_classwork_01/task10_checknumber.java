import java.util.Scanner;

public class task10_checknumber 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.print("Enter an integer: ");
        int M = scanf.nextInt();

        if(M % 2==0)
        {
            System.out.println("True.");
        }
        else
        {
            System.out.println("False.");
        }

        scanf.close();
    }
}
