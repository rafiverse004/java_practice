import java.util.Scanner;

public class NestedMenu {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMain menu:");
            System.out.println("1. Math operations");
            System.out.println("2. Print message");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanf.nextInt();

            switch (choice) {
                case 1:
                    int subChoice;
                    do {
                        System.out.println("\nSub menu:");
                        System.out.println("1. Addition");
                        System.out.println("2. Subtraction");
                        System.out.println("3. Multiplication");
                        System.out.println("4. Back to main menu");
                        System.out.print("Enter your choice: ");
                        subChoice = scanf.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.print("Enter num1: ");
                                float num1 = scanf.nextFloat();
                                System.out.print("Enter num2: ");
                                float num2 = scanf.nextFloat();
                                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                                break;
                            case 2:
                                System.out.print("Enter num1: ");
                                num1 = scanf.nextFloat();
                                System.out.print("Enter num2: ");
                                num2 = scanf.nextFloat();
                                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                                break;
                            case 3:
                                System.out.print("Enter num1: ");
                                num1 = scanf.nextFloat();
                                System.out.print("Enter num2: ");
                                num2 = scanf.nextFloat();
                                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                                break;
                            case 4:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    } while (subChoice != 4);
                    break;

                case 2:
                    System.out.println("You are doing great. Keep it up!");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        scanf.close();
    }
}