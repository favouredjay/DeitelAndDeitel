package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidVolumesTest {

    @Test
    void testDifference(){
        CuboidVolumes cuboidVolumes = new CuboidVolumes();
        assertEquals(14, cuboidVolumes.findDifference(new int[]{3,2,5}, new int[]{1,4,4}));
        assertEquals(106, cuboidVolumes.findDifference(new int[]{9,7,2}, new int[]{5,2,2}));
    }

}