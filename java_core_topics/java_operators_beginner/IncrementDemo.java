// Question: Demonstrate pre-increment and post-increment

public class IncrementDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Base value x = " + x);

        // Example of pre-increment
        // Increments first, then uses the value
        System.out.println("After pre-increment x = " + ++x);

        // Example of post-increment
        // Uses the value first, then increments
        System.out.println("After post-increment x = " + x++);
        
        // Show final value of x
        System.out.println("Final value of x = " + x);
    }
}
