import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        int originalNum = Math.abs(num);
        int temp = originalNum;
        int count = 0;

        if (originalNum == 0) 
        {
            System.out.println(0);
        }
        else
        {
            while (temp > 0) 
            {
                temp = temp / 10;
                count++;
            }
            int divisor = (int) Math.pow(10, count - 1);

            System.out.println("Digits from left to right:");
            while (divisor > 0) {
                int digit = originalNum / divisor;
                System.out.println(digit);

                originalNum = originalNum % divisor;
                divisor = divisor / 10;
            }
        }

        scanf.close();
    }
}
