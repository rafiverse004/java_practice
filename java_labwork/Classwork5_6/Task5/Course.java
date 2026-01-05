public class Course {
    private String courseName;
    private String courseCode;
    private int credit;

    public void updateDetails(String name, String code, int credit) {
        this.courseName = name;
        this.courseCode = code;
        this.credit = credit;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Credit: " + credit);
    }
}
