// Print Numbers from 5 to 1

import java.util.Scanner;

public class Print5to1 {
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = 5;
        printNumber(n);

        scanf.close();
    }
}
