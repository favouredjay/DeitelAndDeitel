package Chapter6;

import java.security.SecureRandom;

import static Chapter6.CoinTossing.HeadsOrTail.HEAD;
import static Chapter6.CoinTossing.HeadsOrTail.TAIL;

public class CoinTossing {
    HeadsOrTail face;
    int headCounter;
    int tailCounter;
    SecureRandom randomNumber = new SecureRandom();

    enum HeadsOrTail{
        HEAD,
        TAIL
    }
    public void flip(){
        int game = randomNumber.nextInt(2);
        if (game + 1 == 1) {
            face = HEAD;
            ++headCounter;
            System.out.println("heads :" + headCounter );
        } else {
            face = TAIL;
            ++tailCounter;
            System.out.println("tails :" + headCounter);
        }


        }
    public void wins() {

        for (int i = 1; i < 10; i++) {
            flip();

            if (headCounter > tailCounter) {
                System.out.println("Head wins");
            } else if (tailCounter > headCounter) {
                System.out.println("tail wins");
            }
        }




    }

    public static void main(String[] args) {
        CoinTossing tossing = new CoinTossing();
//        tossing.flip();
        tossing.wins();
    }

}
