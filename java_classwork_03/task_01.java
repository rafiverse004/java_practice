/*
Write a Java program that asks the user for a quantity,
then takes that many numbers as input and prints the maximum,
minimum and average of those numbers.
*/

import java.util.Scanner;
public class task_01 
{
    public static double findMax(double numbers[])
    {
        double max = numbers[0];
        for (double num : numbers)
        {
            if(num > max)
            {
                max = num;
            }
        }
        return max;
    }

    public static double findMin(double numbers[])
    {
        double min = numbers[0];
        for (double num : numbers)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(double numbers[])
    {
        double sum = 0;
        for (double num : numbers)
        {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter quantity: ");
        int quantity = scanf.nextInt();

        double numbers[] = new double[quantity];
        System.out.println("Enter " + quantity + " numbers: ");
        for (int i=0; i<quantity; i++)
        {
            numbers[i] = scanf.nextDouble();
        }

        double max = findMax(numbers);
        double min = findMin(numbers);
        double average = findAverage(numbers);

        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
        System.out.println("Average " + average);

        scanf.close();
    }    
}
