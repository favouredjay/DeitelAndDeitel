package Extras;

import java.util.ArrayList;
import java.util.List;

public class MultiplyNumbers {

    public static void main(String[] args) {

        int [] array = {2,1,3,4,5};

        canMultiplyNumbers(array);

    }


    public static void canMultiplyNumbers(int[] arr){

        List<Integer> arrayList = new ArrayList<>();
        int j;
        int product = 1;
        for (int i = 0; i<arr.length; i++){

            for (j = 0; j < arr.length;j++ ) {
                if (j==i) {
                    continue;
                }

                product *= arr[j];
            }

            arrayList.add(product);
            product = 1;

        }

        for(int arrElement: arrayList){
            System.out.print(arrElement+" ");
        }
    }


}
