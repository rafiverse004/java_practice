import java.util.Scanner;
public class task_07
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int sec = scanf.nextInt();

        int hours = sec / 3600;
        int remainingsec = sec % 3600;

        int min = remainingsec / 60;
        int remainingsec2 = remainingsec % 60;

        System.out.println("Hours: " + hours + " Minutes: " + min + " Seconds: " + remainingsec2);
        scanf.close();
    }
}
