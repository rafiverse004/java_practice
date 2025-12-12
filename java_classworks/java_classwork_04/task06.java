// Write a Java program that takes two strings from the user and prints their concatenation.

import java.util.Scanner;
public class task06 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanf.nextLine();

        System.out.print("Enter a string: ");
        String str2 = scanf.nextLine();

        System.out.println(str1 + " " + str2);

        scanf.close();
    }
}