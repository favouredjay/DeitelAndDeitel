package Chapter18;

import java.math.BigInteger;

public class Fibonacci {
    private static BigInteger TWO = BigInteger.valueOf(2);
    public static BigInteger fibonacci(BigInteger number){
        if(number.equals(BigInteger.ZERO)|| number.equals(BigInteger.ONE)){
            return number;

        }
        else return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 40; i++) {
            System.out.println(i + " - " + fibonacci(BigInteger.valueOf(i)));

        }
    }
}
