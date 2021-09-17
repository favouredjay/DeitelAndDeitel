package Extras.Sorting;

import java.util.Arrays;

public class BubbleSorting {

    public static void bubbleSort(int [] arrays){
       for (int i = 0; i< arrays.length; i++){
           for(int j = 1; j< arrays.length; j++)
               if(arrays[j] < arrays[j-1]){
                   int temp = arrays[j];
                   arrays[j] = arrays[j-1];
                   arrays[j-1] = temp;

               }
       }

    }

    public static void main(String[] args) {
        int []  numbers = {2,9,4,6,8,5,0,1};
      bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
