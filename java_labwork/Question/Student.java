import java.util.ArrayList;

public class Student {
    public String name;
    public double cgpa;
    public String subject;

    private static ArrayList<Student> allStudents = new ArrayList<>();

    public Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
        allStudents.add(this);
    }
    public Student(String name, double cgpa, String subject){
        this.name = name;
        this.cgpa = cgpa;
        this.subject = subject;
        allStudents.add(this);
    }
    
    public void individualDetail() {
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        if (subject != null) {
            System.out.println("Subject: " + subject);
        }
    }
    
    public static void printDetails() {
        for(Student s : allStudents){
            System.out.println("Name: " + s.name);
            System.out.println("CGPA: " + s.cgpa);
            if (s.subject != null) {
                System.out.println("Subject: " + s.subject);
            }
        }
    }
}
