import java.util.Scanner;
public class task_09
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanf.nextInt();

        if (hours < 0 && hours > 168);
        {
            if (hours <= 40)
            {
                int salary = hours * 200;
                System.out.println(salary);
            }
            else if (hours > 40)
            {
                int overtime = hours - 40;
                int salary = overtime * 300;
                int totalsalary = 8000 + salary;
                System.out.println(totalsalary);
            }
        }
        scanf.close();
    }
}