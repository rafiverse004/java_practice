// Question: Find minimum element in an array

import java.util.Scanner;

public class ArrayMin
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanf.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) arr[i] = scanf.nextInt();

        int min = arr[0];
        for(int i = 1; i < size; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);

        scanf.close();
    }
}
