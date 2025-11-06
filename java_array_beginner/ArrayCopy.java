// Question: Copy elements from one array to another

import java.util.Scanner;

public class ArrayCopy
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanf.nextInt();

        int[] arr = new int[size];
        int[] copy = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        // Copying elements
        for (int i = 0; i < size; i++)
        {
            copy[i] = arr[i];
        }

        System.out.println("Copied array elements:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(copy[i] + " ");
        }
        scanf.close();
    }
}
