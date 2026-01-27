/*
PROBLEM 11:
Build a full Employee hierarchy:
- Payable interface
- Abstract Employee base class
- Subclasses with polymorphic salary calculation
*/

// WHAT YOU ARE LEARNING:
// Interfaces, Abstract Classes, Inheritance, Polymorphism, Method Overriding

// Interface → defines a contract for payment
interface Payable {
    double calculatePay();
}

// Abstract base class → common employee attributes
abstract class Employee implements Payable {

    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Optional concrete method
    public void showDetails() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }

    // calculatePay() remains abstract via interface
}

// SalariedEmployee → fixed salary
class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

// HourlyEmployee → pay based on hours worked
class HourlyEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

// Main class comes last
public class EmployeeHierarchyMain {

    public static void main(String[] args) {

        // Polymorphic references
        Payable emp1 = new SalariedEmployee("Alice", 101, 3000);
        Payable emp2 = new HourlyEmployee("Bob", 102, 20, 120);

        System.out.println("Alice Pay: $" + emp1.calculatePay());
        System.out.println("Bob Pay: $" + emp2.calculatePay());
    }
}
