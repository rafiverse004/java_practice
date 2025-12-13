/*
PROBLEM 16:
Create a Calculator class with multiple add methods (overloading)
*/

// WHAT YOU ARE LEARNING:
// Method Overloading, Compile-time Polymorphism

class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add an array of integers
    int add(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}

// Main class comes last
public class MethodOverloadingMain {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(new int[]{1, 2, 3, 4}));
    }
}
