package chapterFour;

import java.util.Scanner;
public class GuesGame {
    public static void main(String[] args) {
        int correctNumber = 80;
        int enterAnyNumber = 0;
        Scanner game = new Scanner(System.in);


        while (enterAnyNumber != correctNumber) {
            System.out.println("Enter the correct number:");
           enterAnyNumber = game.nextInt();

            if (enterAnyNumber == correctNumber) {
                System.out.println("correct");

            }
            if (enterAnyNumber != correctNumber) {
                System.out.println("wrong input");
            }

        }
    }
    }