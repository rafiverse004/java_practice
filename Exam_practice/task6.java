// 6. Write a Java program that reads a student’s mark for a single subject, and prints out the corresponding grade for that mark.
// You need to make sure that the mark is valid. For example, a student cannot receive -5 or 110 marks. So, the valid marks range from 0 to 100.
// 90 or avobe A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Below 50 F.

import java.util.Scanner;
public class task6
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanf.nextInt();

        if(num < 0 || num > 100) {
            System.out.println("Invalid input.");
        } else if(num >= 90) {
            System.out.println("Grade : A");
        } else if(num >= 80) {
            System.out.println("Grade : B");
        } else if(num >= 70) {
            System.out.println("Grade : C");
        } else if(num >= 60) {
            System.out.println("Grade : D");
        } else if(num >= 50) {
            System.out.println("Grade : E");
        } else {
            System.out.println("Grade : F");
        }

        scanf.close();
    }
}