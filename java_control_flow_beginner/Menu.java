// File name: MenuDoWhile.java
// Question: Simple menu program that repeats until user chooses exit
// Topics: do-while loop, switch-case, break
// Description: Show menu:
//              1. Print hello
//              2. Print world
//              3. Exit
//              Repeat using do-while until user selects exit.

import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print hello");
            System.out.println("2. Print world");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanf.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("World");
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
