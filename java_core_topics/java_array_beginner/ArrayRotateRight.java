// Question: Rotate array elements to the right by N positions

import java.util.Scanner;

public class ArrayRotateRight
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        // Taking the size of the array.
        System.out.print("Enter size of array: ");
        int size = scanf.nextInt();

        // Creating new array.
        int[] arr = new int[size];

        // Taking array elements.
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanf.nextInt();
        }

        // Asking how many time user want to rotate the array.
        System.out.print("Enter how many time you want to rotate: ");
        int num = scanf.nextInt();

        // This makes the rotate less time.
        num = num % size;

        // Creating rotated array.
        int[] rotated = new int[size];
        
        // Transfering array elements.
        for (int i = 0; i < num; i++)
        {
            rotated[i] = arr[size - num + i];
        }

        // Transfering the leftout array elements.
        for (int i = num; i < size; i++)
        {
            rotated[i] = arr[i - num];
        }

        // Printing the rotated array.
        System.out.println("Rotated array elements: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(rotated[i] + " ");
        }

        scanf.close();
    }
}