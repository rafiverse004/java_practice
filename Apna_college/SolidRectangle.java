// 

import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int row = scanf.nextInt();
        System.out.print("Enter column number: ");
        int column = scanf.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scanf.close();
    }
}