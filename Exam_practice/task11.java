// Write a Java program that takes a string as input and prints whether it is a palindrome or not.

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanf.nextLine();

        StringBuilder stringb = new StringBuilder(str1);
        String str2 = stringb.reverse().toString();

        System.out.println(str2);

        if (str1.equals(str2)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        scanf.close();
    }
}
