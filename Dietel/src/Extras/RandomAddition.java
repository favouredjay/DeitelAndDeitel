package Extras;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomAddition {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        SecureRandom number = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int userAnswer = 0;
        int correctAnswer = 0;
        int wrongAnswer = 0;
        int count = 0;
        int randomValues = randomNumber.nextInt(15) ;
        int secondNumber = number.nextInt(15)   ;
        int result = randomValues + secondNumber;
        for(int randomCounter = 0; randomCounter <=10; randomCounter++){

            System.out.println(randomValues + "+" + secondNumber);
            System.out.println("input answer");
            userAnswer = input.nextInt();
            if (userAnswer == result) {
                System.out.println("correct!");
                ++correctAnswer;
            } else{
              System.out.println("Not correct");
            ++wrongAnswer;}


        }
        System.out.println("correct " + correctAnswer + "\nwrong " + wrongAnswer);
    }
}