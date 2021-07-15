package chapterFour;

import java.util.Scanner;
public class Findfactors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num = input.nextInt();
//        int num = 1;
        for (int n = 1; n <= num; n++) {
            for (int m = 1; m <= num; m++) {
                if (n * m == num) {
                    System.out.println(n + "\t" + m);
                }

            }
        }
    }
}