package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkPermutationTest {
    checkPermutation same = new checkPermutation();

    @Test
    void testThatOneStringIsAPermutationOfTheOther(){
    String word = "abcd";
    String otherWord = "bacd";
    String wrongWord = "accb";
    assertTrue(checkPermutation.isPermutation(word, otherWord));
    assertFalse(checkPermutation.isPermutation(word, wrongWord));
    }

}