package Chapter7;

import java.util.Scanner;

public class Arrayss {
   private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(10);
        for (int i = 0; i < intArray.length; i++) {


            System.out.println(intArray[i]);
        }
    }
    public static int[] getIntegers(int i){
        int[] values = new int[i];

        for(int j = 0;  j < values.length; j++){
            values[j] = input.nextInt();
        }
  return values;
    }
}
