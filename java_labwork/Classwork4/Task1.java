import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
