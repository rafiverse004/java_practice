/*
Question:
Write a Java program to take two strings as input and print their concatenation in reverse order (second string followed by first string).
*/

import java.util.Scanner;

public class task8_concatenating 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.print("Enter M: ");
        String M = scanf.next();

        System.out.print("Enter N: ");
        String N = scanf.next();

        System.out.println(N+M);

        scanf.close();
    }
}