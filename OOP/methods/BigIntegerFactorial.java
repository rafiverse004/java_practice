import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("100! = " + fact);
    }
}