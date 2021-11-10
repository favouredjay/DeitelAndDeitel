package Chapter8;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HugeInteger1Test {

    @Test
    void testThatHugeIntegerCanAdd(){
        HugeInteger1 first = new HugeInteger1();
        HugeInteger1 second= new HugeInteger1();
        String firstNumber = "9573";
        String secondNumber = "5678";
        first.parse(firstNumber);
        second.parse(secondNumber);
        System.out.println(HugeInteger1.add(first,second));
        BigInteger result = HugeInteger1.add(first,second);
        assertEquals(result, HugeInteger1.add(first, second));
    }



}