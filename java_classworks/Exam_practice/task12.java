// Write a Java program that takes a string as input and prints the number of vowels and consonants in that string.

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanf.nextLine();
        String str2 = str1.toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<str2.length(); i++) {
            char c = str2.charAt(i);
            if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
    }
        }
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + consonant);

        scanf.close();
    }
}
