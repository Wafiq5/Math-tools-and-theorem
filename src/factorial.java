import java.math.BigInteger;
public class factorial {

    public static BigInteger getFactorial(int numberParam) {
        BigInteger factorial = BigInteger.ONE;
        int number = numberParam;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
