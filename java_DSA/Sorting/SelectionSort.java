// Sort this array using Selection sort {7, 8, 3, 1, 2}

import java.util.Scanner;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int arr[] = {7, 8, 3, 1, 2};

        // Time complexity = O(n^2)
        // Selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArray(arr);

        scanf.close();
    }
}
