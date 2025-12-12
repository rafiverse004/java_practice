/*
Question:
Write a Java program to take two integers as input and print the first number raised to the power of the second.
*/

import java.util.Scanner;

public class task5_PowerCalculator 
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner (System.in);

        System.out.println("First number: ");
        int M = scanf.nextInt();

        System.out.println("Second number: ");
        int N = scanf.nextInt();

        System.out.println("Result: " + Math.pow(M,N));

        scanf.close();
    }
}
