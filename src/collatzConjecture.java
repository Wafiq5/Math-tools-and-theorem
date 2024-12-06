import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Objects;

public class collatzConjecture {
    public static ArrayList<BigInteger> findSequence(BigInteger numParam){
        ArrayList<BigInteger> sequence = new ArrayList<>();
        BigInteger temp = numParam;
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        if (numParam.compareTo(zero) > 0) {
            while (!temp.equals(one)) {
                if (temp.mod(two).equals(one)) {
                    temp = temp.multiply(three).add(one);
                } else {
                    temp = temp.divide(two);
                }
                sequence.add(temp);
            }
        }else {
            sequence.clear();
            sequence.add(zero);
            return sequence;
        }
        return sequence;
    }
}