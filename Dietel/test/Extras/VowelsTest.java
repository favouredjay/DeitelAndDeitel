package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelsTest {

    @Test
    void getCount(){
        assertEquals( 5, Vowels.getCount("abracadabra"));
    }

}