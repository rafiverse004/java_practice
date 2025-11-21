// Write a Java program that finds the number of hours, minutes, and seconds in a given number of seconds.
// The number of seconds is taken as input from the user.

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int sec = scanf.nextInt();

        int hours = sec / 3600;
        sec %= 3600;

        int minutes = sec / 60;
        sec %= 60;

        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + sec);

        scanf.close();
    }
}