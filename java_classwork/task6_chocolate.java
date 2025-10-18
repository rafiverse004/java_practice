import java.util.Scanner;

public class task6_chocolate 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.println("Enter how many chocolate you have: ");
        int num = scanf.nextInt();

        int friendsget=0;
        int youget=0;

        friendsget=num/3;
        youget=num%3;

        System.out.println("Friends get each: "+ friendsget);
        System.out.println("You get: " + youget);

        scanf.close();
    }
}