import java.util.Arrays;

public class passByValue {

    // Tries to change a single int
    public static void changeInt(int num) {
        num = 100;  // Only changes the local copy
        System.out.println("Inside changeInt: num = " + num);
    }

    // Modifies an array element
    public static void changeArray(int arr[]) {
        arr[0] = 100;  // Changes the actual array
        System.out.println("Inside changeArray: arr = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int myNum = 50;
        int[] myArr = {1, 2, 3};

        System.out.println("Before changeInt: myNum = " + myNum);
        changeInt(myNum);
        System.out.println("After changeInt: myNum = " + myNum);  // unchanged

        System.out.println("\nBefore changeArray: myArr = " + Arrays.toString(myArr));
        changeArray(myArr);
        System.out.println("After changeArray: myArr = " + Arrays.toString(myArr));  // changed
    }
}
