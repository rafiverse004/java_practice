// Question: Count even and odd numbers in an array

import java.util.Scanner;

public class ArrayEvenOddCount
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

        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanf.close();
    }
}
