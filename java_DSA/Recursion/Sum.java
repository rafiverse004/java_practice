// Print Sum of 1 to the n postive numbers

import java.util.Scanner;

public class Sum {
    public static void printSum(int n, int num, int sum) {
    if (n > num) {
        System.out.println("Sum: " + sum);
        return;
    }
        System.out.println(n);
        printSum(n + 1, num, sum + n);
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int num = scanf.nextInt();

        printSum(1, num, 0);

        scanf.close();
    }
}
