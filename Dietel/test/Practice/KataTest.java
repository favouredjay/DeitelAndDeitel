package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void testThatNextNumberIsCorrect(){
        Kata kata = new Kata();
        kata.nextNumber(3,6 ,9, 4);
        assertEquals(12, kata.getNextNumber());

    }
    @Test
    void testForNext5Numbers(){
        Kata kata = new Kata();
        kata.nextFiveNumbers(2, 4, 6);
    }

}