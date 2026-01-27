import java.util.Scanner;
public class sumTwo
{
    public static int sumOfTwo(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        int a = scanf.nextInt();
        int b = scanf.nextInt();

        int sum = sumOfTwo(a, b);
        System.out.println("Sum of two : " + sum);

        scanf.close();
    }
}