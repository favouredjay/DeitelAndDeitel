package Chapter6;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {

        GuessTheNumber guessTheNumber = new GuessTheNumber();
               boolean userPlay = true;
while (userPlay) {
    int number = guessTheNumber.generateNumberToGuess();
    System.out.println("Guess a number between 1 and 1000");
    Scanner input = new Scanner(System.in);
    int userInput;
    do {
        userInput = input.nextInt();
        System.out.println(guessTheNumber.checkNumbers(userInput));

        System.out.println("Guess a number between 1 and 1000");

    }while (userInput != number) ;

        System.out.printf("%s%n", guessTheNumber.modifiedGuessTheNumber());

        System.out.println("Do you want to keep playing?");
        System.out.println("Press 0 to stop");

int choice = input.nextInt();
        if (choice == 0)
            userPlay = false;

    }
    }
}

