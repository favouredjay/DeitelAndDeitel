package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassworkTest {


    @Test
    void sum_canwork() {
        ArrayClasswork arrayClasswork = new ArrayClasswork();
        // given
        int[] array = {10, 5, 3};
        //when
        assertEquals(18, ArrayClasswork.getAdd(array));
    }

    @Test
        void averageCanWork(){
        ArrayClasswork arrayClasswork1 = new ArrayClasswork();
        // given
         int [] array = {10, 5, 3};
        //when
        assertEquals(6, ArrayClasswork.getAverage(array));
        }

    @Test
    void maximumCanWork(){
        ArrayClasswork arrayClasswork = new ArrayClasswork();
        // given
        int [] array = {10, 5, 3};
        //when
        assertEquals(10, ArrayClasswork.getMax(array));
    }

    @Test
    void minimumCanWork(){
        ArrayClasswork arrayClasswork = new ArrayClasswork();
        // given
        int [] array = {10, 5, 3};
        // when
        assertEquals(3, ArrayClasswork.getMin(array));
    }

    @Test
    void minimumSum(){
        ArrayClasswork arrayClasswork = new ArrayClasswork();
        //given
        int [] array = {5, 3, 10};
        // when
        assertEquals(8, ArrayClasswork.getMinimumSum(array));
    }

    @Test
    void maximumSum(){
        ArrayClasswork arrayClasswork = new ArrayClasswork();
        // given
        int[] array = {5,3,10};
        // when
        assertEquals(15, ArrayClasswork.getMaximumSum(array));
    }

    @Test
    void testPassArrayByValue(){
        int[] scores ={5,23,98,96,4};
        ArrayClasswork.doubleScore(scores);
        for (int score: scores){
            System.out.print(score + "   ");
        }
    }
}