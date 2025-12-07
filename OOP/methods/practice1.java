import java.util.Scanner;
public class practice1
{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        
        String name = scanf.next();
        printMyName(name);

        scanf.close();
    }
}