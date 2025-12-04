import java.util.Scanner;

public class Student1 {
    String name;
    int age;

    void input(Scanner scanf) {
        System.out.print("Enter name: ");
        name = scanf.nextLine();

        System.out.print("Enter age: ");
        age = scanf.nextInt();
        scanf.nextLine();
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
