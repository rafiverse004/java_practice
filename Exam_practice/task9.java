// Print triangle pattern.

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter row number : ");
        int rows = scanf.nextInt();

        // First pattern.
        System.out.println("First triangle pattern: ");
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Second pattern.
        System.out.println("Second triangle pattern: ");
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Third pattern.
        System.out.println("Third triangle pattern: ");
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        scanf.close();
    }
}