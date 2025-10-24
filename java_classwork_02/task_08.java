/*
Question:
Write a Java program to calculate the velocity of a car given the distance (in meters) and time (in seconds). 
The program should convert distance to kilometers and time to hours, then calculate velocity in km/h.
Based on the velocity, print:
- "Too slow. Needs more changes." if velocity < 60 km/h
- "Velocity is okay. The car is ready!" if velocity is between 60 and 90 km/h
- "Too fast. Only a few changes should suffice." if velocity > 90 km/h
*/

import java.util.Scanner;
public class task_08
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter distance: ");
        float distance = scanf.nextFloat();

        System.out.print("Enter time: ");
        float time = scanf.nextFloat();

        float distancekm = distance / 1000;
        float timehour = time / 3600;

        float velocity = distancekm / timehour;

        System.out.println("Velocity: " + velocity + " km/h.");

        if(velocity < 60)
        {
            System.out.println("Too slow. Needs more changes.");
        }
        else if(velocity >= 60 && velocity <= 90)
        {
            System.out.println("Velocity is okay. The car is ready!");
        }
        else if(velocity > 90)
        {
            System.out.println("Too fast. Only a few changes should suffice.");
        }
        else
        {
            System.out.println("Invalid try again.");
        }

        scanf.close();
    }
}