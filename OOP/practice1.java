// Create a Student class, Fields: name, age, Methods: printInfo(), Make 3 objects and print their info.
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        Student1 s1 = new Student1();
        s1.input(scanf);

        Student1 s2 = new Student1();
        s2.input(scanf);

        s1.printInfo();
        s2.printInfo();
    }
}