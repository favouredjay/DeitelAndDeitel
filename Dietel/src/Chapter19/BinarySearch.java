package Chapter19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int linearSearch(int [] data, int searchKey){
        for (int i = 0; i < data.length; i++)
//            data[i] = 10 + random.nextInt(99);

            if (data[i] == searchKey)
                return i;



        return -1;
    }

    public static void main(String[] args) {
        int [] data = new int[10];
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] =  10 +random.nextInt(99);

            System.out.println(Arrays.toString(data));

            System.out.println("Enter a number or -1 to exit");
            int searchInt = input.nextInt();

            while (searchInt != -1){
                int position = linearSearch(data,searchInt );
                if(position == -1){
                    System.out.println(searchInt + " no found");
                    break;
                }
                else{
                    System.out.println(searchInt + " found in " + position);

                    System.out.println("Enter a number or -1 to exit");
                    searchInt = input.nextInt();
                }
            }



        }

    }
}
