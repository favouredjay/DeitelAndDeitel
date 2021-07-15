package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PollingTest {

    Polling polling = new Polling();

    @Test
    void testThatPollingIsNotNull(){
        assertNotNull(polling);
    }


}