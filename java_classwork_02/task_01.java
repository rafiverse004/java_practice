import java.util.Scanner;
public class task_01
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanf.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Difference is: " + difference);
        
        scanf.close();
    }
}