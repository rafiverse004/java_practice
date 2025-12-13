import java.util.ArrayList;

public class Student {
  public String name;
  public int id;

  // Constructor name and age.
  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  // Constructor only name.
  public Student(String name) {
    this.name = name;
  }

  // Creating dynamic list to store course details.
  public ArrayList<Course> courseList = new ArrayList<>();

  public void addCourse(Course course) {
    courseList.add(course);
  }

  public void display() {
    System.out.println("My name: " + name);
    System.out.println("My id: " + id);
    System.out.println("My course list: ");
    for (int i = 0; i < courseList.size(); i++) {
      System.out.println("Course name: " + courseList.get(i).courseName);
      System.out.println("Course code: " + courseList.get(i).courseCode);
      System.out.println("Course credit hour: " + courseList.get(i).credit);
    }
  }
}