public class tester3 {
    public static class Employee {
        String name;
        double salary;
        String designation;

        void newEmployee(String name) {
            this.name = name;
            this.salary = 30000;
            this.designation = "junior";
        }

        double calculateTax() {
            if (salary > 50000) {
                return salary * 0.30;
            } else if (salary > 30000) {
                return salary * 0.10;
            } else {
                return 0;
            }
        }

        void promoteEmployee(String newDesignation) {
        String nd = newDesignation.toLowerCase();

        if (nd.equals("senior")) {
            this.salary += 25000;
            this.designation = "senior";
        } else if (nd.equals("lead")) {
            this.salary += 50000;
            this.designation = "lead";
        } else if (nd.equals("manager")) {
            this.salary += 75000;
            this.designation = "manager";
        } else {
            System.out.println("Unknown promotion!");
            return;
        }

            System.out.println("Employee Name: " + name);
            System.out.printf("New Salary: %.1f Tk\n", salary);
        }

        void displayInfo() {
            System.out.println("Employee Name: " + name);
            System.out.printf("Employee Salary: %.1f Tk\n" , salary);
            System.out.println("Employee Designation: " + designation);
        }

        void displayTax() {
            double tax = calculateTax();
            if (tax > 0) {
                System.out.print(name + " ");
                System.out.println("Tax: " + tax);
            } else {
                System.out.println("No need to pay tax");
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");

        System.out.println("1 ==========");
        emp1.displayInfo();

        System.out.println("2 ==========");
        emp2.displayInfo();

        System.out.println("3 ==========");
        emp3.displayInfo();

        System.out.println("4 ==========");
        emp1.displayTax();

        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");

        System.out.println("6 ==========");
        emp1.displayTax();

        System.out.println("7 ==========");
        emp1.displayInfo();

        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");

        System.out.println("9 ==========");
        emp3.displayTax();

        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}