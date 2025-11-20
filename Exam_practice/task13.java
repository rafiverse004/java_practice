// Write a Java program that takes a string as input and 
// prints only the upper-case/ lower-case letters from that string.

import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanf.nextLine();

        System.out.print("Upper Case : ");
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                System.out.print(c + " ");
            }
        } System.out.println();

        System.out.print("Lower Case : ");
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                System.out.print(c + " ");
            }
        }

        scanf.close();
    }
}
