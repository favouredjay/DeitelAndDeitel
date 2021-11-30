package Extras;

public class Troll {

    public static String disEmVowel(String str){
//        StringBuilder sb = new StringBuilder(str);


//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'A' || sb.charAt(i) == 'e' || sb.charAt(i) == 'E' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'I' || sb.charAt(i) == 'o'
//                    || sb.charAt(i) == 'O' || sb.charAt(i) == 'U' || sb.charAt(i) == 'u') {
//                sb.deleteCharAt(i);
//
//
//            }
//
//        }
//        String[] str1=str.split("");
//        StringBuilder sb=new StringBuilder();
//
//        for (String s : str1) {
//            for (int count = 0; count < s.length(); count++) {
//                if (s.charAt(count) == 'A' || s.charAt(count) == 'a' || s.charAt(count) == 'E'
//                        || s.charAt(count) == 'e' || s.charAt(count) == 'I' || s.charAt(count) == 'i'
//                        || s.charAt(count) == 'O' || s.charAt(count) == 'o' || s.charAt(count) == 'U'
//                        || s.charAt(count) == 'u') {
//                    continue;
//                }
//                sb.append(s.charAt(count));
//            }
//
//        }
//        return sb.toString();
        return str.replaceAll("(?i)[aeiou]","");
//        str = str.replaceAll("[AaEeIiOoUu]", "");
//        return str;


    }

    public static void main(String[] args) {
        System.out.println(disEmVowel("No Offense but,\nYour writing is among the worst I've ever read"));
    }
}
