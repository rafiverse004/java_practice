public class UniversityTester {
    public static void main(String[] args) {
        
        University u1 = new University();
        University u2 = new University();

        System.out.println("Location of u1: " + u1);
        System.out.println("Location of u2: " + u2);

        System.out.println("u1: name = " + u1.name + ", country = " + u1.country);
        System.out.println("u2: name = " + u2.name + ", country = " + u2.country);

        System.out.println("Are u1 and u2 the same object? " + (u1 == u2));

        u1.name = "Imperial College London";
        u1.country = "England";


        u2.name = "Eastern University";
        u2.country = "Bangladesh";

        System.out.println("\nAfter updating instance variables:");
        System.out.println("u1: name = " + u1.name + ", country = " + u1.country);
        System.out.println("u2: name = " + u2.name + ", country = " + u2.country);

        boolean sameName = u1.name.equals(u2.name);
        boolean sameCountry = u1.country.equals(u2.country);
        System.out.println("Do u1 and u2 have the same name? " + sameName);
        System.out.println("Do u1 and u2 have the same country? " + sameCountry);
    }
}
