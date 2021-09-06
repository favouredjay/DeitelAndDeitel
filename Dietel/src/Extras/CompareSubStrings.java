package Extras;

import java.util.SortedSet;
import java.util.TreeSet;

public class CompareSubStrings {

    public static String smallestAndLargest(String word, int num){
        SortedSet<String>letter = new TreeSet<>();
        for(int i = 0; i < word.length()-num+1; i++){
            letter.add(word.substring(i, num+i));
        }
        System.out.println(letter);


        String smallest = letter.first();
        String largest = letter.last();
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

       smallestAndLargest("iloveJesus", 3) ;
    }
}
