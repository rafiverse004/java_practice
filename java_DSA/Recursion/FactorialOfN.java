// Print Factorial of n numbers

import java.util.Scanner;

    public static long calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int num = scanf.nextInt();

        System.out.println("Factorial: " + calculateFactorial(num));

        scanf.close();
    }

