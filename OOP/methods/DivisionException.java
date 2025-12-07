import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        try {
            System.out.print("Enter first integer (a): ");
            int a = scanf.nextInt();
            System.out.print("Enter second integer (b): ");
            int b = scanf.nextInt();

            int result = a / b;
            System.out.println("a / b = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        scanf.close();
    }
}
