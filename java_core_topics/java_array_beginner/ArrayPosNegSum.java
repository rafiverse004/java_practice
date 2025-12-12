// Question: Sum positive and negative numbers separately

import java.util.Scanner;

public class ArrayPosNegSum
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanf.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) arr[i] = scanf.nextInt();

        int posSum = 0, negSum = 0;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] > 0)
            {
                posSum += arr[i];
            }
            else if(arr[i] < 0)
            {
                negSum += arr[i];
            }
        }

        System.out.println("Sum of positive numbers: " + posSum);
        System.out.println("Sum of negative numbers: " + negSum);

        scanf.close();
    }
}
