package chapterFour;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);

        double score = 0;
        double sum;
        double result = 0;

        while (score < 10) {
            System.out.println("Type in a number and press enter");
            sum = scam.nextDouble();
            if (sum >=1 && sum <= 100) {
                result += sum;
                score++;
            }
        }
            double average = result / (score)*1.0;
            System.out.println("the total average is " + average);



        }

    }

