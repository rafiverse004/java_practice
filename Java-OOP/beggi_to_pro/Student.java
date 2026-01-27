// Create a Student class and override toString.
// Overriding toString(), customizing object representation.

class studentInfo {
    private String name;
    private int age;
    private int studentId;

    // Constructor.
    public studentInfo (String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getters.
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getStudentId() { return studentId; }

    // Setters.
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setStudentID(int studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return "Student Details:\n" +
               "Name      : " + name + "\n" +
               "Age       : " + age + "\n" +
               "StudentID : " + studentId;
    }
}

public class Student {
    public static void main(String[] args) {
        studentInfo s1 = new studentInfo("Rafik", 21, 101);

        System.out.println(s1); // calls toString automatically
    }
}
