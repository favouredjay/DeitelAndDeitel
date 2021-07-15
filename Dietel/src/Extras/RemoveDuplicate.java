package Extras;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void noDuplicate(int [] numbers){
        ArrayList <Integer> values = new ArrayList<>();
        values.add(numbers[0]);
        for (int i = 0; i< numbers.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j<values.size();j++){
               if(values.get(j) == numbers[i]) {
                   isDuplicate = true;
                   break;
               }
            }
            if (!isDuplicate) {
                values.add(numbers[i]);
            }
        }
        values.forEach(System.out::println);
        System.out.println(values.size());

    }

    public static void main(String[] args) {
        int [] numbers = {0,0,1,1,2,2,3,3,4,4};
        noDuplicate(numbers);
    }
}
