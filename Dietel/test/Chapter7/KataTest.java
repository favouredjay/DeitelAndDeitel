package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
Kata kata = new Kata();
    int[] arrays = {1,2,34,5,6,7};
    int [] descArrays = {1,2,34,5,6,7};

@Test
    void testThatArrayCanBeArrangedInDescendingOrder(){

   assertNotSame(descArrays, kata.descendingArray(kata.arrays));


}



}