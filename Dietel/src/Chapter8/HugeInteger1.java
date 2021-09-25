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

    public BigInteger getValue() {
        StringBuilder value = new StringBuilder();
        for (int i = 0, digitsLength = array.length; i < digitsLength; i++) {
            int digit = array[i];
            value.append(digit);
        }
        return new BigInteger(value.toString());
    }
    public static BigInteger add(HugeInteger1 first, HugeInteger1 second){
        return first.getValue().add(second.getValue());
    }




}
