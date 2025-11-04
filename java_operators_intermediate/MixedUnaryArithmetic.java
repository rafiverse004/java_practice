// Demonstrate effect of mixing unary and arithmetic operators

public class MixedUnaryArithmetic
{
    public static void main(String[] args)
    {
        int d = 5;
        int e = d++ + ++d; // post-increment then pre-increment

        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
