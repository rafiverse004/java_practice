import java.util.Scanner;
public class factorialOfN
{
    public static void factorial(int num){
        if(num<0){
            System.out.println("Invalid number.");
            return;
        }
        int sum=1;
        for(int i = 2; i<=num; i++){
            sum*=i;
        }
        System.out.println("Factorial : " + sum);
        return;
    }
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        int num = scanf.nextInt();
        factorial(num);

        scanf.close();
    }
}