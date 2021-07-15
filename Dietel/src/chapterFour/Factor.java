package chapterFour;

import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for(int i = 1; i <= num; i++ ) {

        if (num % i == 0) {
            System.out.println(i);
        }
        }


    }
}
