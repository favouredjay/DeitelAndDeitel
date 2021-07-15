package Chapter6;
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {



    private static  int numberToGuess;
    private int count;


    Scanner userInput = new Scanner(System.in);
    public int generateNumberToGuess() {
        SecureRandom number = new SecureRandom();
         numberToGuess = 1+ number.nextInt (1000);
        return numberToGuess;

    }

    public String checkNumbers(int values) {
        if (values > numberToGuess){
            count++;
        return "Number too high";
    }
        else if
        (values < numberToGuess ) {
            count++;
            return "Number too low";

        }
        else
            return "Congratulations, you guessed the number";
    }

    public String modifiedGuessTheNumber(){
        if(count <= 10)
            return "Either you got lucky or you know the secret";
       else if(count == 10)
           return "Aha, you know the secret";
        else
            return "You should do better";
    }
}
