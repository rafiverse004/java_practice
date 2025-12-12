// Demonstrate compound assignment

public class CompoundAssignment
{
    public static void main(String[] args)
    {
        int x = 10;

        x += 5 * 2; // x = 10 + 10 = 20
        System.out.println("After x += 5*2: " + x);

        x -= 3;     // x = 20 - 3 = 17
        System.out.println("After x -= 3: " + x);

        x *= 2;     // x = 17 * 2 = 34
        System.out.println("After x *= 2: " + x);

        x /= 4;     // x = 34 / 4 = 8 (integer division)
        System.out.println("After x /= 4: " + x);

        x %= 3;     // x = 8 % 3 = 2
        System.out.println("After x %= 3: " + x);
    }
}
