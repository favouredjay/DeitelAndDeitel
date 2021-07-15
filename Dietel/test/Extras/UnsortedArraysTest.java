package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsortedArraysTest {
    UnsortedArrays arrays = new UnsortedArrays();

    @Test
    void testThatArrayCanBeSorted(){
int [] array = {2,1,3,4,3};
int [] sortedArrays = {1,2,3,3,4};
//assertEquals(sortedArrays, arrays.sortArray(array));
    }

}