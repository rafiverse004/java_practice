import java.util.Scanner;
public class problem_546A{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        int k = scanf.nextInt();

        int n = scanf.nextInt();

        int w = scanf.nextInt();

        int total = 0;
        for(int i=1; i<=w; i++){
            total += k*i;
        }
        int need = total - n;
        System.out.println(need > 0 ? need : 0);
        scanf.close();
    }
}