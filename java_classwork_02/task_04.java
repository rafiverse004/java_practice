import java.util.Scanner;
public class task_04
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanf.nextInt();

        if(num1 > num2)
        {
            int subtraction = num1 - num2;
            System.out.println(subtraction);
        }
        else
        {
            int subtraction = num2 - num1;
            System.out.println(subtraction);
        }
        scanf.close();
    }
}