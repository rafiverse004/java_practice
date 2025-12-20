// Print Numbers from 1 to 5

import java.util.Scanner;

public class Print1to5 {
    public static void printNumber(int n){
        if(n == 6){
            return;
        }
        System.out.print(n + " ");
        printNumber(n+1);
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = 1;
        printNumber(n);

        scanf.close();
    }
}
