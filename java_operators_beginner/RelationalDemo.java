// Question: Compare two numbers using relational operators

import java.util.Scanner;
public class RelationalDemo 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num1 = ");
        int num1 = scanf.nextInt();

        System.out.print("Enter num2 = ");
        int num2 = scanf.nextInt();

        if(num1 == num2)
        {
            System.out.println("Numbers are equal.");
        }
        if(num1 != num2)
        {
            System.out.println("Numbers are not equal.");
        }
        if(num1 > num2)
        {
            System.out.println("Num1 is greater th1n num2");
        }
        if(num1 < num2)
        {
            System.out.println("Num1 is smaller than num2");
        }
        if(num1 >= num2)
        {
            System.out.println("Num1 is greater than or equal to num2");
        }
        if(num1 <= num2)
        {
            System.out.println("Num1 is smaller than or equal to num2");
        }
        scanf.close();
    }
}
