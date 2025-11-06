// Question: Reverse elements of an array

import java.util.Scanner;

public class ArrayReverse
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
        System.out.println("Array in reverse order:");
        for(int i = size - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        scanf.close();
    }
}
