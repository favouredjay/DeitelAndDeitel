package chapterFour;
import java.security.SecureRandom;
import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] array = new int[6];
        for (int rollDice = 1; rollDice<=6000000; rollDice++) {
            int randomNumber = 1 + random.nextInt(6);
            array[randomNumber - 1]++;
        }
            for (int head = 0; head < array.length; head++) {
                System.out.printf("%3d%8d%n ", head+ 1, array[head]);
            }
        }




    }


