import java.util.Scanner;
public class practice3
{
    public static int productOfTwo(int a, int b){
        return a * b;
    }
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        int a = scanf.nextInt();
        int b = scanf.nextInt();

        System.out.println("Product of two : " + productOfTwo(a, b));

        scanf.close();
    }
}