//Write a Java program that asks the user to input a string. Count and print the number of vowels and consonants in that string.

import java.util.Scanner;
public class task05 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a full sentence: ");
        String line = scanf.nextLine();

        System.out.println(line);

        int vowels = 0;
        int consonants = 0;
        
        line = line.toLowerCase();

        for (int i = 0; i < line.length(); i++){
        char c = line.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanf.close();
    }
}