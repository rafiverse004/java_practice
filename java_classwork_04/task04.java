//Write a Java program that takes a full sentence from the user and prints it.

import java.lang.reflect.Array;
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a full sentence: ");
        String line = scanf.nextLine();

        System.out.println(line);

        scanf.close();
    }
}