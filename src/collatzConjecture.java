import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

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


//! MAIN METHOD

//Scanner ask = new Scanner(System.in);
//BigInteger number = ask.nextBigInteger();
//BigInteger one = BigInteger.ONE;
//BigInteger two = BigInteger.TWO;
//BigInteger four = new BigInteger("4");
//
//
//ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();
//sequence = collatzConjecture.findSequence(number);
//long steps = + sequence.size();
//BigInteger largest = BigInteger.ZERO;
//        for (int i = 0; i < sequence.size(); i++) {
//        if (sequence.get(i).compareTo(largest) > 0){
//largest = sequence.get(i);
//            }
//                    }
//boolean followsCollatzConjecture = true;
//String followsCollatzConjectureString = "";
//        if (sequence.get(sequence.size() - 3).equals(four) && sequence.get(sequence.size() - 2).equals(two) && sequence.get(sequence.size() - 1).equals(one)){
//              followsCollatzConjectureString = "Yes";
//        }else {
//              followsCollatzConjectureString = "No";
//        }
//
//        System.out.println(sequence);
//        System.out.println("Steps: " + steps);
//        System.out.println("Largest: " + largest);
//        System.out.println("Follows Collatz Conjecture?: " + followsCollatzConjectureString);
