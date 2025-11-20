// Write a java program that takes a number from the user and prints its divisors.

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanf.nextInt();

        System.out.print("Divisors of " + num + " are : ");
        for(int i=1; i<=(num/2); i++) {
            if(num%i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanf.close();
    }
}
