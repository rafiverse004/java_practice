// Write a Java program that reads an integer and prints "True" if the number is even, otherwise, "False".

import java.util.Scanner;
public class task2
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanf.nextInt();

        if(num % 2 == 0) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }

        scanf.close();
    }
}