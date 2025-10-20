import java.util.Scanner;
public class task_03
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanf.nextInt();

        if (num1 == num2)
        {
            System.out.println("The numbers are equal.");
        }
        else if (num1 < num2)
        {
            System.out.println("Second is greater.");
        }
        else if (num1 > num2)
        {
            System.out.println("First is greater.");
        }
        else
        {
            System.out.println("Invalid input.");
        }
        scanf.close();
    }
}