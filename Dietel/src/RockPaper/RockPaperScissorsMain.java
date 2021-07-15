package RockPaper;
import java.util.Scanner;

public class RockPaperScissorsMain {
    private static Object GameMove;

    public static void main(String[] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Scanner userInput = new Scanner(System.in);


        int playerChoice;
        System.out.println("Input number to play: " + rockPaperScissors.playerPlay());
        playerChoice = userInput.nextInt();
        rockPaperScissors.playerPlay();
        System.out.println(rockPaperScissors.computerRandomMoveCanBeGenerated());
        System.out.println(rockPaperScissors.computerCanWinOrLose());


    }


    }

