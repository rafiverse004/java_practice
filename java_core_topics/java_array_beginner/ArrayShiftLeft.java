// Shift all elements to the left by one position

import java.util.Scanner;

public class ArrayShiftLeft
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanf.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr1[i] = scanf.nextInt();
        }

        int first = arr1[0];

        int[] arr2 = new int[size];
        for (int i=0; i<size-1; i++)
        {
            arr2[i] = arr1[i+1];
        }
        arr2[size-1] = first;

        System.out.println("Shifted array elements:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr2[i] + " ");
        }

        scanf.close();
    }
}