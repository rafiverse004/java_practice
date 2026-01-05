public class Manager extends Employee {
  
    private int bonusPercent;
    private double finalSalary;

    public Manager(String name, double baseSalary, int hoursWorked, int bonusPercent) {
        super(name, baseSalary, hoursWorked);
        this.bonusPercent = bonusPercent;
    }

    public void calculateSalary() {
        if (getHoursWorked() > 40) {
            finalSalary = getBaseSalary() + (getBaseSalary() * bonusPercent / 100.0);
        } else {
            finalSalary = getBaseSalary();
        }
    }

    public void requestIncrement(double amount) {
        if (getHoursWorked() > 100) {
            System.out.println("$" + amount + " Increment approved.");
            setBaseSalary(getBaseSalary() + amount);
        } else if (getHoursWorked() > 80) {
            System.out.println("$" + (amount / 2) + " Increment approved.");
            setBaseSalary(getBaseSalary() + amount / 2);
        } else {
            System.out.println("Increment denied.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Bonus: " + bonusPercent + " %");
        System.out.println("Final Salary: $" + finalSalary);
    }
}
