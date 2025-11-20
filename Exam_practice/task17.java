// Write a java program that takes a string as input and prints all the characters in reverse order.

import java.util.Scanner;
public class task17 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanf.nextLine();

        StringBuilder stringb = new StringBuilder(str1);
        String str2 = stringb.reverse().toString();

        System.out.println("Reversed string : " + str2);

        scanf.close();
    }
}