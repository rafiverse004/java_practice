import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a valid integer: ");
            if (scanf.hasNextInt()) {
                num = scanf.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Try again.");
                scanf.next(); // clear invalid input
            }
        }

        System.out.println("You entered: " + num);
        scanf.close();
    }
}
