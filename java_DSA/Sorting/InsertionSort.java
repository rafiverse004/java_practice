import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int arr[] = {7, 8, 3, 1, 2};

        // Insertion sort
        // i for unsorted array, j for sorted array
        // i moves forward, j moves backward
        // We assume that index 0 element is sorted so we start loop from index 1
        for(int i = 1; i < arr.length; i++){
            int current = arr[i]; // first element from unsorted part
            int j = i - 1;

            // For ascending order, shift elements greater than current
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        printArray(arr);

        scanf.close();
    }
}
