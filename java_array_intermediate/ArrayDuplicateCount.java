// Question: Count duplicate elements in an array 

import java.util.Scanner;

public class ArrayDuplicateCount
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

        boolean[] visited = new boolean[size];
        System.out.println("Duplicate elements and their counts:");
        for (int i = 0; i < size; i++)
        {
            if (visited[i])
            {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1)
            {
                System.out.println(arr[i] + " occurs " + count + " times.");
            }

            scanf.close();
        }
    }
}