public class Developer extends Employee {
    
    private String language;
    private double finalSalary;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }

    public void calculateSalary() {
        if (language.equalsIgnoreCase("Java")) {
            finalSalary = getBaseSalary() + 700;
        } else {
            finalSalary = getBaseSalary();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + finalSalary);
    }
}
