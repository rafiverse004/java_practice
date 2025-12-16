// Sort this array using Bubble sort {7, 8, 3, 1, 2}

import java.util.Scanner;

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int arr[] = {7, 8, 3, 1, 2};

        // Time complexity = O(n^2)
        // Bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

        scanf.close();
    }
}
