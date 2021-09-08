package Chapter18;

import java.math.BigInteger;

public class FactorialWithBigDecimal {
    public static BigInteger factorials(BigInteger number){
        if(number.compareTo(BigInteger.ONE)<0){
            return BigInteger.ONE;
        }
        else return number.multiply(factorials(number.subtract(BigInteger.ONE)));

    }

    public static void main(String[] args) {
//        for (int i = 0; i <=50 ; i++) {
//            System.out.println(i + " - " + factorials(BigDecimal.valueOf(i)) );
//
//        }
        int number = 0;
        System.out.println(factorials(BigInteger.valueOf(4)));
    }
}
