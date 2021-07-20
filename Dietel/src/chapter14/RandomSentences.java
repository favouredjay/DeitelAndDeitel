package chapter14;

import java.security.SecureRandom;

public class RandomSentences {
    public static void main(String[] args) {


        SecureRandom random = new SecureRandom();

        String [] articles = { "the", "a", "one", "some", "any"};
        String [] nouns = {"boy", "girl", "dog", "town", "car"};
        String [] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposition = {"to", "from", "over", "under", "on"};

//        int random1 = (int) (articles.length*Math.random());
//        int random2 = (int) (Math.random() * nouns.length);
//        int random3 = (int) (Math.random()* verbs.length);
//        int random4 = (int) (Math.random() * preposition.length);
//        int random5 = (int) (Math.random() * articles.length);
//        int random6 = (int) (Math.random() * nouns.length);

//        String[][] sentences = {articles, nouns, verbs, preposition, articles, nouns};
       for (int counter = 0; counter<= 20; counter++){

        int index = random.nextInt(5);
        StringBuilder word = new StringBuilder();
       word.append(articles[index].substring(0,1).toUpperCase() + (articles[index].substring(1) + " "));
        int j = random.nextInt(5);
        word.append(nouns[j] + " ");
        int i = random.nextInt(5);
        word.append(verbs[i] + " ");
        int t = random.nextInt(5);
        word.append(preposition[t] + " ");
        int x = random.nextInt(5);
        word.append(articles[x] + " ");
        int y = random.nextInt(5);
        word.append(nouns[y] + ".");

           System.out.println(word);
       }



    }
}
