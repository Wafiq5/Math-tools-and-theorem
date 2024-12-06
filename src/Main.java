import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        BigInteger number = ask.nextBigInteger();

        ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();
        sequence = collatzConjecture.findSequence(number);
        System.out.println(sequence);
        System.out.println("Steps: " + sequence.size());
    }
}