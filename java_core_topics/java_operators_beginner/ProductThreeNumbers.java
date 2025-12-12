// Question: Multiply three numbers

import java.util.Scanner;
public class ProductThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanf.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanf.nextInt();

        System.out.println("Enter num3: ");
        int num3 = scanf.nextInt();


        int product = num1 * num2 * num3;
        System.out.println("Product = " + product);

        scanf.close();
    }
}
