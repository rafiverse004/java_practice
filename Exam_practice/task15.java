// Write a java program that takes a number as input and
// prints whether it is a prime number / perfect number.

import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        boolean isPrime = true;
        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        int sum = 0;
        for(int i=1; i<=(num/2); i++) {
            if(num%i == 0) {
                sum += i;
            }
        }
        if(sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        scanf.close();
    }
}