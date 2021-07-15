package chapterFour;
import java.security.SecureRandom;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int firstNumber =(int)(Math.random()* 10);
        int secondNumber = (int)(Math.random()*10);

        Scanner input = new Scanner(System.in);
        System.out.println(firstNumber + " + " + secondNumber + " =  ? " );
        int answer = input.nextInt();

        while(answer != firstNumber + secondNumber) {
            System.out.println("Wrong input \n Try again \n What is " + firstNumber + " + " + secondNumber + " ? ");
            answer = input.nextInt();
        }
        System.out.println("Correct");

    }
}
