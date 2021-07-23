package chapter14;

public class SelfAssessment {
    public static void main(String[] args) {


        String[] strings = {"Generation"};
        String word = "  a,b,c is abc  ";
        int count = 0;
        for (String string : strings) {

//                count++;

            System.out.println(string.indexOf('e'));
        }

        System.out.println(word.trim());
    }
}