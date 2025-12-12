// Question: Convert a positive number to negative using unary minus

import java.util.Scanner;

public class UnaryMinusDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Using unary minus operator to convert to negative
        int negativeNum = -num;

        System.out.println("The negative of " + num + " is " + negativeNum);
        
        sc.close();
    }
}
