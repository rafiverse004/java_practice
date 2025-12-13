public class Tester {
    public static void main(String[] args) {

        // Create a Department
        Department d1 = new Department("IT");

        // Create Employees
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        // Add employees to the department
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addEmployee(e3);

        // Display department details
        d1.display();
    }
}
