public class A {
    public static int temp = 3;
    public int sum;
    public int y;

    public A() {
        y = temp - 1;
        sum = temp + 2;
        temp -= 2;
    }

    public void methodA(int m, int[] n) {
        int x = 0;
        y = y + m + (temp++);
        x = x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(x + " " + y + " " + sum);
    }
}