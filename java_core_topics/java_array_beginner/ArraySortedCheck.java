// Question: Check if an array is sorted in ascending order

import java.util.Scanner;

public class ArraySortedCheck
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanf.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        boolean sorted = true;
        for (int i = 0; i < size - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                sorted = false;
                break;
            }
        }

        if (sorted)
        {
            System.out.println("Array is sorted in ascending order.");
        }
        else
        {
            System.out.println("Array is not sorted in ascending order.");
        }
        scanf.close();
    }
}
