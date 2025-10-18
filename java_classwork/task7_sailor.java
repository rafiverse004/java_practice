import java.util.Scanner;

public class task7_sailor 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.println("Enter how much weight you have: ");
        int weight = scanf.nextInt();

        int cannotbetaken = 0;
        cannotbetaken = weight % 4;

        int canbetaken = 0;
        canbetaken = weight - cannotbetaken;

        System.out.println("Can be taken: " + canbetaken);

        scanf.close();
    }
}