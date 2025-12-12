// Question: Demonstrate compound assignment operators

public class CompoundAssignmentDemo 
{
    public static void main(String[] args)
    {
        int x = 0;

        //instead of x = x + 5 we can write...
        x += 5;
        System.out.println("x become = " + x);

        //instead of x = x -3 we can write...
        x -= 3;
        System.out.println("x become = " + x);

        //instead of x = x * 2 we can write...
        x *= 2;
        System.out.println("x become = " + x);

        //instead of x = x / 4 we can do...
        x /= 4;
        System.out.println("x become = " + x);

        //instead of x = x % 3 we can write...
        x %= 3;
        System.out.println("x become = " + x);
    }
}
