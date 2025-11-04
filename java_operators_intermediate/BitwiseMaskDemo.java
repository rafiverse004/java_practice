// Question: Use bitwise AND to extract certain bits

import java.util.Scanner;

public class BitwiseMaskDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter a mask: ");
        int mask = sc.nextInt();

        int result = number & mask;
        System.out.println("Result of number & mask: " + result);
        sc.close();
    }
}