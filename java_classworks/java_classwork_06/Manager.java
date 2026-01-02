public class Manager extends Employee{
  public int bonus;
  double final_salary;
  public Manager(String name, int base_salary, int working_hours, int bonus){
    super(name, base_salary, working_hours);
    this.bonus=bonus;
  }
  public void calculateSalary(){
    if(getHoursWorked()>40){
      final_salary=getBaseSalary()+(getBaseSalary()*bonus/100.0);
    }
    else{
      final_salary=getBaseSalary();
    }
  }
  public void requestIncrement(double increment_amount){
    if(getHoursWorked()>100){
      System.out.println("Increment Approved "+ increment_amount);
      setBaseSalary(getBaseSalary()+increment_amount);
    }
    else if(getHoursWorked()>80){
      System.out.println("Increment Approved "+ increment_amount/2);
      setBaseSalary(getBaseSalary()+(increment_amount/2));
    }
    else{
      System.out.println("Increment denied");
    }
  }
  //method override
  public void displayInfo() { 
    System.out.println("Name: " + name); 
    System.out.println("Base Salary: $" + getBaseSalary()); 
    System.out.println("Work Hours: " + getHoursWorked());
    System.out.println("Final Salary: " + final_salary);
  }
  
}
