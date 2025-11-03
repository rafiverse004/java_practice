// Question: Negate a boolean value

import java.util.Scanner;
public class NegateBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        // Using logical NOT (!) operator to negate the boolean
        boolean negatedValue = !value;

        System.out.println("The negation of " + value + " is " + negatedValue);
        
        sc.close();
    }
}
