// TASK-4:
// Design the Manager and Developer class derived from the Employee class with appropriate attributes and properties so that the driver code can generate the output given below.
// Hint: 
// Manager: 
// 1. Adds a bonus to the base salary if the manager works more than 40 hours. 
// 2. If the manager works more than 100 hours, the full amount is approved;
// if they work more than 80 hours, half the amount is approved. Otherwise, the increment is denied. 
// Developer:
// 1. Adds $700 to the base salary if the developer works with Java programming language.

// OUTPUT:
// 1.========== 
// Name: Neymar 
// Base Salary: $1000.0 
// Work Hours: 45 
// Bonus: 10.0 % 
// Final Salary: $1100.0 
// 2.========== 
// Increment denied. 
// 3.========== 
// $50 Increment approved. 
// 4.========== 
// 5.========== 
// Name: Neymar 
// Base Salary: $1050.0 
// Work Hours: 85 
// Bonus: 10.0 % 
// Final Salary: $1155.0 
// 6.========== 
// 7.========== 
// Name: Messi 
// Base Salary: $1000.0 
// Work Hours: 50 
// Language: Java 
// Final Salary: $1700.0 
// 8.========== 
// Name: Chiesa 
// Base Salary: $1000.0 
// Work Hours: 50 
// Language: Javascript 
// Final Salary: $1000.0

public class EmployeeTester {
    public static void main(String[] args) {
        Manager neymar = new Manager("Neymar", 1000, 45, 10);
        Developer messi = new Developer("Messi", 1000, 50, "Java");
        Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
        neymar.calculateSalary();
        System.out.println("1.==========");
        neymar.displayInfo();
        System.out.println("2.==========");
        neymar.requestIncrement(100);
        System.out.println("3.==========");
        neymar.setHoursWorked(85);
        neymar.requestIncrement(100);
        System.out.println("4.==========");
        neymar.calculateSalary();
        System.out.println("5.==========");
        neymar.displayInfo();
        System.out.println("6.==========");
        messi.calculateSalary();
        System.out.println("7.==========");
        messi.displayInfo();
        System.out.println("8.==========");
        chiesa.calculateSalary();
        System.out.println("9.==========");
        chiesa.displayInfo();
    }
}