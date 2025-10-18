import java.util.Scanner;

public class task9_firstletter 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.print("Enter a line: ");
        String M = scanf.next();

        System.out.println(M.charAt(0));

        scanf.close();
    }
}
