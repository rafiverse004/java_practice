public class Tester5 {
    public static void main(String[] args) { 
        Course c1 = new Course();
        Course c2 = new Course();

        System.out.println("========== 1 ==========");
        c1.updateDetails("Structured Programming", "06131205", 3); 
        c1.displayCourse();

        System.out.println("========== 2 ==========");
        c2.updateDetails("Object Oriented Programming", "06132107", 3); 
        c2.displayCourse();

        System.out.println("========== 3 ==========");
        c1.updateDetails("Algorithm", "06132211", 3); 
        c1.displayCourse();
    }
}
