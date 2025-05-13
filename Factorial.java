import java.math.BigInteger;
public class Factorial {
    public static BigInteger fact(BigInteger num) {
        // BigInteger num = BigInteger.valueOf(n);
        // BigInteger num = new BigInteger(String.valueOf(n));
        int comparison = num.compareTo(BigInteger.ZERO);
        if(comparison == 0)
           return BigInteger.ONE;
        else
           return num.multiply(fact(num.subtract(BigInteger.ONE)));
    }
}
