package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    TV myTv = new TV();

    @Test
    void tvIsNotNull(){

        assertNotNull(myTv);
    }

    @Test
    void tv_isOff(){
        boolean isOff = !myTv.isOn();
        assertTrue(isOff);
    }

    @Test
    void TvCanBeTurnedOn(){
//        TV tv = new TV(1);
        boolean isOff = !myTv.isOn();
        assertTrue(isOff);
        //when
        myTv.turnOn();
        //assert
        assertTrue(myTv.isOn());
    }

    @Test
    void userCanIncreaseChannel(){
//       TV tv = new TV();
        myTv.turnOn();
        myTv.channelUp();
        assertEquals(1, myTv.getChannel());
        myTv.channelUp();
        assertEquals(2, myTv.getChannel());
        myTv.channelUp();
        assertEquals(3, myTv.getChannel());
    }

}