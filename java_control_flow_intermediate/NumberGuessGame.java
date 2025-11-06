// Question: Simple number guessing game with replay
// Description: Computer picks a random number (1-max).
// Keep asking user to guess until correct.
// Print "Too high" or "Too low" for each guess.
// Ask user if they want to play again after finishing.

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        System.out.print("Enter max number : ");
        int max = scanf.nextInt();

        System.out.println("----- Welcome to Number Guessing Game! -----");

        // Outer loop for replay
        do
        {
            int fixed = random.nextInt(max) + 1; // Random number 1-max
            int num = 0;
            int count = 0;

            // Inner loop for guessing
            do
            {
                System.out.print("Enter your guess (1 to " + max + "): ");
                num = scanf.nextInt();

                if(num >= 1 && num <= max)
                {
                    // Check guess
                    if(num == fixed)
                    {
                        System.out.println("Correct guess.");
                    } 
                    else if(num > fixed)
                    {
                        System.out.println("Too high. Try lower number.");
                    }
                    else // num < fixed
                    {
                        System.out.println("Too low. Try higher number.");
                    }

                    count++;
                    System.out.println("Attempt no: " + count);

                    // Hints
                    if(count == 5)
                    {
                        if(fixed <= (max/2))
                        {
                            System.out.println("Hint: The number is between 1 to " + max / 2 + ".");
                        }
                        else
                        {
                            System.out.println("Hint: The number is between " + max /2 + " to " + max + ".");
                        }
                    }

                    if(count == 10)
                    {
                        if(fixed % 2 == 0)
                        {
                            System.out.println("Hint: The number is even.");
                        }
                        else
                        {
                            System.out.println("Hint: The number is odd.");
                        }
                    }

                    if(count == 15)
                    {
                        System.out.println("You are so dumb.");
                    }
                }
                else
                {
                    System.out.println("Invalid input. Try again (1- " + max + ").");
                }

            }
            while(num != fixed);

            // Replay prompt
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanf.next();

        }
        while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanf.close();
    }
}