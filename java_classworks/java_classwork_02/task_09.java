/*
Write a Java program to calculate weekly salary based on working hours with the following pay structure:

Regular rate: $200 per hour for the first 40 hours

Overtime rate: $300 per hour for any hours beyond 40

The program should only accept hours between 0 and 168 (inclusive)

Display an error message for any invalid input outside this range
*/
import java.util.Scanner;
public class task_09
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanf.nextInt();

        if (hours < 0 && hours > 168)
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