package chapter14;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstWord = "Java is a cool language";
        String secondWord = "Java is a programming language";

        firstWord = firstWord.replaceFirst("\\w*", "****");
        System.out.println(firstWord);
    }
}
