// Question: Find average of array elements

import java.util.Scanner;

public class ArrayAverage
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

        int sum = 0;
        for(int i = 0; i < size; i++)
        {
            sum += arr[i];
        }

        double average = (double) sum / size;
        System.out.println("Average of array elements: " + average);

        scanf.close();
    }
}
