package Chapter8;

import java.math.BigInteger;

public class HugeInteger1 {
    int [] array = new int[40];
    public int[] parse (String s){
        for(int i = 0; i < s.length(); i++){
            char j = s.charAt(i);
            if(Character.isDigit(j)){
                array[i] = Character.getNumericValue(j);
            }else {
                array[i] = 0;
            }
        } return array;
    }

    public BigInteger get() {
        StringBuilder value = new StringBuilder();
        for (int i = 0, digitsSize = array.length; i < digitsSize; i++) {
            int digit = array[i];
            value.append(digit);
        }

        return new BigInteger(value.toString());
    }
    public static BigInteger add(HugeInteger1 first, HugeInteger1 second){
        return first.get().add(second.get());
    }
    public static BigInteger subtract(HugeInteger1 first, HugeInteger1 second){
        return first.get().subtract(second.get());
    }
//    public boolean isGreaterThan(HugeInteger1 first, HugeInteger1 second) {
//        return BigInteger.valueOf(first.get()).compareTo(BigInteger.valueOf(second))
//    }
    public  static  BigInteger multiply(HugeInteger1 first, HugeInteger1 second){
        return first.get().multiply(second.get());
    }
    public  static  BigInteger divide(HugeInteger1 first, HugeInteger1 second){
        return second.get().divide(first.get());
    }
    public static BigInteger modulo (HugeInteger1 first, HugeInteger1 second){
        return second.get().remainder(first.get());
    }





}
