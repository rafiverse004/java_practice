// Write a Java program that reads N integers into an array and then takes another integer as search key.
// The program should print whether the number is found or not found in the array.

import java.util.Scanner;
public class task03 {
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
        System.out.println("Enter an element to search: ");
        int find = scanf.nextInt();

        boolean found = false;
        for(int i=0; i<size; i++){
            if(find == arr[i]){
                found = true;
            }
        }
        if(found){
            System.out.println("Found.");
        } else {
            System.out.println("Not found.");
        }

        scanf.close();
    }
}