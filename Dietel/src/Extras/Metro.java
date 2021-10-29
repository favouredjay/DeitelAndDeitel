package Extras;

import java.util.ArrayList;
//There is a bus moving in the city, and it takes and drop some people in each bus stop.
//
//        You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
//
//        Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
//
//        Take a look on the test cases.
//
//        Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.
//
//        The second value in the first integer array is 0, since the bus is empty in the first bus stop.

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int sum = 0;
        int minus = 0;
        int result = 0;

        for (int i = 0; i < stops.size(); i++) {

            for (int j = 0; j < stops.get(i).length; j++) {
                System.out.println(stops.get(i)[j]);

            }
            sum += stops.get(i)[0];
            minus += stops.get(i)[1];
            result = sum - minus;

        }

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(result);
return result;
    }

    public static void main(String[] args) {
        ArrayList<int[]>list = new ArrayList<int[]>();
        list.add(new int[]{10, 2});
        list.add(new int[]{0, 4});
        list.add(new int[]{3, 2});
        countPassengers(list);
    }
}