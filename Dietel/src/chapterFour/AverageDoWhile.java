package chapterFour;

import java.util.Scanner;

public class AverageDoWhile {

    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);

        double score = 0;
        double sum;
        double result = 0;

        do {
            System.out.println("Type in a number and press enter");
            sum = scam.nextDouble();
            if (sum >= 1 && sum<=100) {
                result += sum;
                score++;
            }
        }
        while(score < 10);
        double average = result / (score)*1.0;
        System.out.println("the total average is " + average);



    }

}


