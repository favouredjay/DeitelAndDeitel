package chapter14;

public class Exercises {

    public int totalNumberOfOccurrencesOfALetter(String s, char t) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t == s.charAt(i)) {
                count++;
            }

        }
        return count;

    }
    public int totalOccurrenceOfAWordInAString(String s, String word) {

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.regionMatches(i, word, 0, word.length()))
                counter++;


        }
        return counter;
    }


}

