// Write a Java code that will calculate the value of y if the expression of y is as follows (n is the input):
// y=1-2+3-4......+n/-n.
// y=12−22+32−42+52.........+n2
// y=12-15+18-21+24-27+30

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanf.nextInt();

        // Series 1: 1 - 2 + 3 - 4 + ... ± n
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum1 -= i;
            } else {
                sum1 += i;
            }
        }
        System.out.println("Series 1 sum = " + sum1);

        // Series 2: 12 - 22 + 32 - 42 + ... (increment 10)
        int sum2 = 0;
        int num1 = 12;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum2 -= num1;
            } else {
                sum2 += num1;
            }
            num1 += 10;
        }
        System.out.println("Series 2 sum = " + sum2);

        // Series 3: 12 - 15 + 18 - 21 + 24 - ... (increment 3)
        int sum3 = 0;
        int num2 = 12;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum3 -= num2;
            } else {
                sum3 += num2;
            }
            num2 += 3;
        }
        System.out.println("Series 3 sum = " + sum3);
        
        // Series 4: 12, -22, 32, -42, 52, (increment 10 and change sign.).
        int num3 = 12;
        for(int i=1; i<=n; i++) {
            if(i%2==0) {
                num3 *= (-1);
                System.out.print(num3 + ", ");
            } else {
                System.out.print(num3 + ", ");
            }
            if(num3<0) {
                num3 *= (-1);
            }
            num3 += 10;
        }

        scanf.close();
    }
}