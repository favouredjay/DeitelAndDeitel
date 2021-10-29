package Extras;

import java.util.Arrays;

public class checkPermutation {

    public static boolean isPermutation(String word1, String word2) {
        int wordLength1 = word1.length();
        int wordLength2 = word2.length();

        if (wordLength1 != wordLength2) {
            return false;
        }
        char[] ch = word1.toCharArray();
        char[] ch1 = word2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));

            if (Arrays.equals(ch, ch1)) {
                return true;

            }

        return false;

            }


    public static void main(String[] args) {
        System.out.println(isPermutation("abdc", "bcda"));
    }
}
