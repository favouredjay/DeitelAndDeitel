package chapter14;
import java.security.SecureRandom;
public class Limerick {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        String[] twoSentences = { "\nBut its colour and size,",
                                   " \nSo bedazzled her eyes,",};
        String [] threeSentences = {
                "\nThere was a Young Lady of Dorking,",
                "\nWho bought a large bonnet for walking,",
                "\nThat she very soon went back to Dorking."};


            StringBuilder limerics = new StringBuilder();
            int j = random.nextInt(3);
            limerics.append(threeSentences[j]);
            int y = random.nextInt(3);
            limerics.append(threeSentences[y]);
            int index =random.nextInt(2);
            limerics.append(twoSentences[index]);
            int i = random.nextInt(2);
            limerics.append(twoSentences[i]);
            int k = random.nextInt(3);
            limerics.append(threeSentences[k]);


        System.out.println(limerics);

    }
}
