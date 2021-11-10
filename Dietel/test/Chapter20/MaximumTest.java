package Chapter20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTest {

    @Test
    void testThatMaximumElementCanBeGotten(){

        assertEquals(5, Maximum.maximum(5,3,4));
        assertEquals(5.9, Maximum.maximum(2.5, 4.7, 5.9));
        assertEquals("strange", Maximum.maximum("level", "strange", "beauty"));
    }

}