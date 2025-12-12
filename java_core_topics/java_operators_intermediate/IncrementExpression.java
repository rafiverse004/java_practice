// Question: Show effect of pre/post increment in expressions

public class IncrementExpression
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = a++ + ++a; // post and pre increment

        System.out.println("a = " + a); // 7
        System.out.println("b = " + b); // 12
    }
}
