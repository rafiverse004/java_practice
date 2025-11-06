// Question: Calculate sum of all elements in an array

import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanf.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < size; i++)
        {
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);

        scanf.close();
    }
}
