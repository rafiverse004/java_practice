import java.util.Scanner;
public class methodOverloading
{
    public static int cals(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static double cals(double a, double b){
        double product=a*b;
        return product;
    }
    public static int cals(String str){
        int length = str.length();
        return length;
    }

    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        System.out.println("Sum : " + cals(a, b));

        double x = scanf.nextDouble();
        double y = scanf.nextDouble();
        System.out.println("Product : " + cals(x, y));

        String str = scanf.next();
        System.out.println("Length : " + cals(str));

        scanf.close();
    }
}