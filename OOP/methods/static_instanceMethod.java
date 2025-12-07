import java.util.Scanner;

class Calculator {
    // Instance methods
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    // Static method
    public static void greet() {
        System.out.println("Welcome to the Calculator!");
    }
}

public class static_instanceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator.greet();

        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.sub(a, b));
        System.out.println("Multiplication: " + calc.mul(a, b));
        System.out.println("Division: " + calc.div(a, b));

        sc.close();
    }
}
