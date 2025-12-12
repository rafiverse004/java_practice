// Write a java program to find out the ascii value of a character.(vice versa)
// Uppercase letters: A–Z → ASCII 65–90
// Lowercase letters: a–z → ASCII 97–122

import java.util.Scanner;
public class task16 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanf.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);

        System.out.print("Enter an ASCII value (integer): ");
        int value = scanf.nextInt();
        char character = (char) value;
        System.out.println("Character for ASCII value " + value + " is: '" + character + "'");

        scanf.close();
    }
}