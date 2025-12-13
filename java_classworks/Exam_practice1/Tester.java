public class Tester
{
  public static void main(String [] args)
  {
    Student s1 = new Student("bob", 18);
    Student s2 = new Student("alex");

    Course c1=new Course("OOP", "CSE203", 3);
    Course c2=new Course("Algorithm", "CSE103", 3);

    s1.addCourse(c1);
    s1.addCourse(c2);
    
    s1.display();
  }
}