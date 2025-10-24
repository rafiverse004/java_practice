/*
Question:
Write a Java program to take a user's name as input and print it.
*/

import java.util.Scanner;

public class task4_printName 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanf.nextLine();

        System.out.println("Your name is " + name);

        scanf.close();
    }
}