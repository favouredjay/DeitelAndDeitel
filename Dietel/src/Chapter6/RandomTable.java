package Chapter6;
import java.security.SecureRandom;
public class RandomTable {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int [] arrays =new int [20];
        for (int i = 0; i < arrays.length; i++) {
            int temp = random.nextInt(9);

            if (i % 5 == 0 ) {
                System.out.println();
            }
            System.out.print(" " + temp);

        }

    }
}
