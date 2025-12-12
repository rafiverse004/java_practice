// Write a Java program that takes an integer input from the user, representing the number of pencils in a box.
// The user wants to distribute these pencils equally among 4 students. Your program should calculate and display: 
// How many pencils each student will receive and How many pencils will remain in the box.

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of pencil: ");
        int total = scanf.nextInt();

        int oneGet = total / 4;
        int leftOut = total % 4;

        System.out.println("Each student get " + oneGet + "pencils.");
        System.out.println(leftOut + " pencils will remain in the box.");

        scanf.close();
    }
}