// Write a Java code of a program that asks the user to enter ten numbers and
// then display the total and the average of ONLY the odd numbers among those ten numbers.

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter 10 numbers : ");
        int sum = 0;
        double average = 0;
        int count = 0;
        for(int i=0; i<10; i++) {
            int num = scanf.nextInt();
            if(num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        average = sum / count;
        System.out.println("Sum : " + sum + " and Average : " + average);

        scanf.close();
    }
}