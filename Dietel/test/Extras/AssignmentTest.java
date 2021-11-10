package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void test1(){
        int fathersYear = 1;
        int sonsYear = 1;
        assertEquals(30, Assignment.calculateAge(40, 5));
    }

}