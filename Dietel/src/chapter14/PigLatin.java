package chapter14;

public class PigLatin {
    public static void main(String[] args) {
        String word = "the";

        StringBuilder displaceWord = new StringBuilder(word.substring(1));
        displaceWord.append(word.charAt(0));
        displaceWord.append("ay");
        System.out.println(displaceWord);





    }
}
