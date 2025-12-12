// Question: Remove duplicate elements in an array 

import java.util.Scanner;

public class ArrayRemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        // Taking array size.
        System.out.print("Enter array size: ");
        int size = scanf.nextInt();

        // Taking array elements.
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        // Creating new array name visited.
        boolean visited[] = new boolean[size];

        System.out.println("Unique array : ");
        for (int i = 0; i < size; i++)
        {
            if (!visited[i])
            {
                System.out.print(arr[i] + " ");

                for (int j = i + 1; j < size; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        visited[j] = true;
                    }
                }
            }
        }
        scanf.close();
    }
}