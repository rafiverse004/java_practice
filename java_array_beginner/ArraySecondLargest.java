// Question: Find the second largest element in an array

import java.util.Scanner;

public class ArraySecondLargest
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanf.nextInt();

        if (size < 2)
        {
            System.out.println("Array must have at least two elements.");
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("No second largest element (all elements are equal).");
        }
        else
        {
            System.out.println("Second largest element: " + secondLargest);
        }
        scanf.close();
    }
}
