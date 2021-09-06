package Extras;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringCompare {
//    public static String largestAndSmallestSubstring(String word, int num){
//        String largest = "";
//        String smallest =word.substring(0,num);
//        for (int i =0; i<word.length()-num+1;i++){
//            if (word.substring(i,num+i).compareTo(smallest)<0){
//                smallest = word.substring(i,num+i);
//            }
//            if (word.substring(i,num+i).compareTo(largest)>0){
//                largest = word.substring(i,num+i);
//            }
//        }
//
//        return  smallest+"\n"+largest;
//    }
    public static String largestAndSmallestSubstringWithSet(String word, int num){
        String smallest ="";
        String largest = "";

        SortedSet<String> letter = new TreeSet<>();
        for (int i =0; i<word.length()-num+1;i++){
            letter.add(word.substring(i,num+i));
        }
        System.out.println(letter);
        smallest = letter.first();
        largest = letter.last();


        return  smallest+"\n"+largest;
    }


        public static void main(String[] args) {
        System.out.println(largestAndSmallestSubstringWithSet("welcometojava",3));
    }
}
