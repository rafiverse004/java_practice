// Write a Java program that prints a rectangle of size M (height/line numbers) and
// N (length/column numbers) using incrementing numbers where M and N will be given as input.

import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter height of a rectangle: ");
        int height = scanf.nextInt();

        System.out.print("Enter height of a rectangle: ");
        int length = scanf.nextInt();

        for(int i=1; i<=height; i++) {
            for(int j=1; j<=length; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanf.close();
    }
}