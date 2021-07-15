package chapterFour;

import java.util.Scanner;
public class LargerThan {

    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        int num = 0;
        int j;
        int max = 0;
        int min = 0;

//        int largestNumber = 0;
//        int smallestNumber = 0;
        for (j = 1; j <= 3; j++)
            num = scam.nextInt();


        if (num > j) {
            max = num;


//        } else if (j < num) {
//            min = j;
//
//
//        }
            System.out.println("Smallest Number:" + min);
            System.out.println("Largest Number:" + max);

        }

    }
}