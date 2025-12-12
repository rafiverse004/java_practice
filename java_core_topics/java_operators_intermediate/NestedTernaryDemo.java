import java.util.Scanner;

public class NestedTernaryDemo
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        String result = (num > 0) ? "Positive" : (num < 0 ? "Negative" : "Zero");

        System.out.println("Number is: " + result);
        scanf.close();
    }
}
