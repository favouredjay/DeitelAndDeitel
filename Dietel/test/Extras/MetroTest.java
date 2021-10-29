package Extras;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class MetroTest {
    Metro metro = new Metro();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{12, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{5, 5});
        assertEquals(10, Metro.countPassengers(list));
    }
}