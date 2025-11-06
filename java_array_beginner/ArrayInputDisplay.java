// Question: Read elements into an array and display them

import java.util.Scanner;

public class ArrayInputDisplay
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanf.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        scanf.close();
    }
}
