// Question: Search for an element in an array

import java.util.Scanner;

public class ArrayLinearSearch
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

        System.out.print("Enter element to search: ");
        int target = scanf.nextInt();

        int index = -1;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == target)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
        System.out.println("Not found");
        }
        scanf.close();
    }
}
