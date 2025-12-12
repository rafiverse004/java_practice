// Write a Java program that creates an integer array based on the size given by the user.
// Then take user input to fill the array and finally print the array elements.

import java.util.Scanner;
public class task01 {
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

        scanf.close();
    }
}