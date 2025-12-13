import java.util.ArrayList;

public class Department {
    public String name;

    // Constructor
    public Department(String name){
        this.name = name;
    }

    // Creating Employee list. A dynamic list.
    public ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void display(){
        System.out.println("Department name: " + name);
        System.out.println("Employee list: ");
        for(int i=0; i<employeeList.size(); i++){
            System.out.println("Employe name: " + employeeList.get(i).name);
            System.out.println("Employe id  : " + employeeList.get(i).id);
        }
    }
}
