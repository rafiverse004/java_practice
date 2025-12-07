// Write a Java program that reads N integers into an array and finds the largest element of the array.

import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanf.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = scanf.nextInt();
        }
        System.out.print("The array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for(int i=0; i<size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max: " + max);

        scanf.close();
    }
}