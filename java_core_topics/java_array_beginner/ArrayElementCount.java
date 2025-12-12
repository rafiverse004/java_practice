// Question: Count occurrences of a specific element

import java.util.Scanner;

public class ArrayElementCount
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

        System.out.print("Enter number to count: ");
        int num = scanf.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] == num)
            {
                count++;
            }
        }

        System.out.println(num + " occurs " + count + " time(s) in the array.");
        scanf.close();
    }
}
