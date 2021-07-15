package Chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Chapter16point14 {
    private static void createMap(Map<Character, Integer> map){
        String word = "Java Programming";
        char[]letters = word.toCharArray();
        for(char letter: letters){
            if(map.containsKey(letter)){
                int count = map.get(letter);
                map.put(letter, count + 1);
            }else map.put(letter, 1);

        }

    }
    public static void displayMap(Map<Character, Integer> map){
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        for(char key: sortedKeys){
            System.out.printf("%s\t\t\t\t%2s%n" ,key , map.get(key));
        }
        System.out.printf("%nsize: %d%n is Empty: %b%n",map.size() , map.isEmpty());
    }

    public static void main(String[] args) {
            Map<Character, Integer> map = new HashMap<>();
            createMap(map);
            displayMap(map);
    }
}
