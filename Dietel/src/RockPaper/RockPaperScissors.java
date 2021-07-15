package RockPaper;

import java.security.SecureRandom;
import java.util.Scanner;
public class RockPaperScissors {

    private Status player;
    private GameMove computer;
    private GameMove move;

    enum Status {
        WON,
        LOST,
        DRAW
    }

    Scanner input = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    public void computerPlay(int computerChoice) {

        if (computerChoice == 1) {
            computer = GameMove.ROCK;
        } else if (computerChoice == 2) {
            computer = GameMove.PAPER;
        } else if (computerChoice == 3) {
            computer = GameMove.SCISSORS;
        }
    }

    public GameMove computerCanPlay() {
        return computer;
    }

    public GameMove computerRandomMoveCanBeGenerated() {
        int computerChoice = random.nextInt(3);
        if (computerChoice == 1) {
            computer = GameMove.ROCK;
        } else if (computerChoice == 2) {
            computer = GameMove.PAPER;
        } else if (computerChoice == 3) {
            computer = GameMove.SCISSORS;
        }
        return computer;
    }

    public void playerCanPlay(int playerChoice) {

        playerChoice = input.nextInt();
        if (playerChoice == 1) {
            move = GameMove.ROCK;
        }
        if (playerChoice == 2) {
            move = GameMove.PAPER;
        }
        if (playerChoice == 3) {
            move = GameMove.SCISSORS;
        }
    }



    public GameMove playerPlay() {
        return move;
    }

    public Status playerCanWinOrLose() {
        if (playerPlay() == GameMove.PAPER && computerCanPlay() == GameMove.ROCK || playerPlay() == GameMove.ROCK && computerCanPlay() == GameMove.SCISSORS || playerPlay() == GameMove.SCISSORS && computerCanPlay() == GameMove.PAPER) {
            System.out.println("Player Won");
            return Status.WON;
        } else {
            System.out.println("Player Lost");
            return Status.LOST;
        }
    }

    public Status computerCanWinOrLose() {
        if (computerCanPlay() == GameMove.PAPER && playerPlay() == GameMove.ROCK || computerCanPlay() == GameMove.ROCK && playerPlay() == GameMove.SCISSORS || computerCanPlay() == GameMove.SCISSORS && playerPlay() == GameMove.PAPER) {
            System.out.println("Computer Won");
            return Status.WON;
        } else {
            System.out.println("Computer Lost");
            return Status.LOST;
        }
    }

    public Status playerCanDraw() {
        if (computerCanPlay() == GameMove.PAPER && playerPlay() == GameMove.PAPER || computerCanPlay() == GameMove.ROCK && playerPlay() == GameMove.ROCK || computerCanPlay() == GameMove.SCISSORS && playerPlay() == GameMove.SCISSORS) {
            System.out.println("Draw");
            return Status.DRAW;
        }
        else {
            throw new IllegalStateException();
        }

    }
}