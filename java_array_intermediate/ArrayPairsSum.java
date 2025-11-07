//Find all pairs of elements whose sum equals a given number.

import java.util.Scanner;

public class ArrayPairsSum
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

        System.out.print("Enter the sum : ");
        int sum = scanf.nextInt();

        boolean found = false;
        for(int i=0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(sum == arr[i] + arr[j])
                {
                    System.out.println(arr[i] + "," + arr[j]);
                    found = true;
                }
            }

        }
        if(!found)
        {
            System.out.println("There is no pair whose sum is equal to " + sum);
        }

        scanf.close();
    }
}
