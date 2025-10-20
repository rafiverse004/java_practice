import java.util.Scanner;
public class task_06
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scanf.nextInt();

        if (num % 2 == 0 ^ num % 5 == 0)
        {
            System.out.println(num);
        }
        else
        {
            System.out.println("Not a multiple of 2 OR 5");
        }
        scanf.close();
    }
}
