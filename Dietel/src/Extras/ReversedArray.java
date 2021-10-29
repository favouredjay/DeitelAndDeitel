package Extras;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {


        int [] array = {1,4,5,3,8,15};
        int maxLength = array.length-1;
        int halfArray = array.length/2;
        System.out.println("Before reversing: " + Arrays.toString(array));
        for (int i = 0; i < halfArray ; i++) {
            int temp = array[i];
            array[i] = array[maxLength-i];
            array[maxLength-i] = temp;




        }System.out.println("After reversing: " +Arrays.toString(array));

    }
}
