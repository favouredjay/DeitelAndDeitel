package chapterFour;
import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.Math.*;

public class SubtractionQuiz {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int firstNumber = randomNumbers.nextInt(10);
        int secondNumber = randomNumbers.nextInt(10);

        if (firstNumber<secondNumber){
            int temp = firstNumber;
            firstNumber = temp;
            temp = secondNumber;
        }
        System.out.println(secondNumber + "-" + firstNumber + "= ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (secondNumber-firstNumber == answer)
            System.out.println("Correct");

        else {
            System.out.println("Wrong input");
            System.out.println(secondNumber + " - " + firstNumber + " should be " + (secondNumber - firstNumber));
        }
    }

}
