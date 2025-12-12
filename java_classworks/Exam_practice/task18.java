// Trace the following codes and write the output(s):

import java.util.Scanner;
public class task18 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
 

	    int a = 10, b = 5, c = 8;
        a = ++b + c--;
        boolean result = (a > c) && (b != c) || (--a == b);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("result = " + result);
        System.out.println(b++ == c);
        System.out.println(a+c%b<=10);

        int A = 12, B = 7, C, D, E = 10;

        C = B++;
        D = A - B;
        E = C-- + A--;

        System.out.println(A > B && (D != 0));
        System.out.println((B++ == E));
        System.out.println(((++C + D) >= A));
        System.out.println((A + C) == B || E < (C + D));


        scanf.close();
    }
}