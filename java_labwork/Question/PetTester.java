public class PetTester {
    public static void main(String[] args) {

        Pet.showReport();
        System.out.println("--------------------");

        Pet p1 = new Pet("Buddy", "Dog");
        p1.describe();
        System.out.println("--------------------");

        Pet.showReport();
        System.out.println("--------------------");

        Pet p2 = new Pet("Mimi", "Cat", "Alice");
        p2.describe(false);
        System.out.println("--------------------");

        Pet.showReport();
        System.out.println("--------------------");

        Pet p3 = new Pet("Rocky", "Dog");
        p3.describe(true);
        System.out.println("--------------------");

        Pet.showReport();
    }
}
