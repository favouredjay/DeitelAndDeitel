package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SidTest {
    @Test
    public void test1() {
        assertEquals("not at all", Sid.howMuchILoveYou(150));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }

}