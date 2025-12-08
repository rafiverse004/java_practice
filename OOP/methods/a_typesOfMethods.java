/*
Method Call Rules in Java:

| Method Type        | Same Class Call                       | Different Class Call                                | Notes                                                              |
|--------------------|---------------------------------------|-----------------------------------------------------|--------------------------------------------------------------------|
| Non-static         | obj.methodName()                      | obj.methodName()                                    | Must create an object (obj) first                                  |
| Static             | methodName() or ClassName.methodName()| ClassName.methodName()                              | Can call directly in same class or via class name from other class |
| Access Modifiers   | Must respect public, private, etc.    | Must be public (or package-private in same package) | Controls visibility                                                |

Rules:
1. Non-static methods always require an object.
2. Static methods belong to the class and can be called without an object.
3. Public methods can be accessed from other classes/files.
*/

public class a_typesOfMethods {

    // 1. Simple instance method with return value
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Void method (does not return anything)
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method overloading (same name, different parameters)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // 4. Static method (can be called without object)
    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    // 5. Recursive method
    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 6. Method with variable arguments (varargs)
    public int sumAll(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        a_typesOfMethods obj = new a_typesOfMethods();

        // Calling instance methods
        int sum = obj.add(5, 7);
        System.out.println("Sum: " + sum);

        obj.greet("Rafik");

        System.out.println("Multiply int: " + obj.multiply(3, 4));
        System.out.println("Multiply double: " + obj.multiply(2.5, 4.0));

        // Calling static method
        a_typesOfMethods.sayGoodbye();

        // Recursive method
        int fact = obj.factorial(5);
        System.out.println("Factorial of 5: " + fact);

        // Varargs method
        int total = obj.sumAll(1, 2, 3, 4, 5);
        System.out.println("Sum of all numbers: " + total);
    }
}
