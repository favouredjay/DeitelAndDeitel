//Write a function that returns a sorted array and and displays the first and last index of an element.
package Kata;

import java.util.ArrayList;
import java.util.List;

public class UnsortedArrays {
    List<Integer>arrayList = new ArrayList<>();

    int [] arrays = {0,-2,5,4,-1,9,3,2,1,1,6,6, 6, 7,8,6,1};
    static int temp;
    public  void sortArray(int[]arrays) {
        int number = 0;
        int value = 9;
        int j;
        int i;
        for ( i = 0; i < arrays.length; i++) {
            for (number = i + 1; number < arrays.length; number++)
                if (arrays[i] > arrays[number]) {
                    temp = arrays[i];
                    arrays[i] = arrays[number];
                    arrays[number] = temp;
                }

        }
        for (j = 0; j < arrays.length; j++) {
            if (value == arrays[j]) {
                arrayList.add(j);
            }

            }

        if (arrayList.size() != 0) {
            System.out.println("[" + arrayList.get(0) + " " + arrayList.get(arrayList.size()-1) + "]");
        } else System.out.println("[-1,-1]");
    }


    public static void main(String[] args) {
        UnsortedArrays arrays = new UnsortedArrays();
        arrays.sortArray(arrays.arrays);
        for(int i : arrays.arrays){
            System.out.print(i + " ");
        }
    }


}