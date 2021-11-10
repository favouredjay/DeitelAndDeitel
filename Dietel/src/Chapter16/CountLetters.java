package Chapter16;

import java.util.*;

public class CountLetters {
    public static void countLetters(Map<Character, Integer>map){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.next();

//        String[] token = s.split("\\w");
//        for(String letters : token){
//            Character l = letters.toLowerCase();
        for (int i = 0; i <s.length() ; i++) {
            Character token = s.toLowerCase().charAt(i);
            if(map.containsKey(token)){
                int count = map.get(token);
                map.put(token, count+1);
            }
            else map.put(token, 1);
        }
    }

    public static void displayMap(Map<Character, Integer> map){
        Set<Character>keys = map.keySet();
        TreeSet<Character>sortedKeys = new TreeSet<>(keys);
        System.out.println("Map contains: ");
        for(Character i : sortedKeys){
            System.out.println(i + "  -  " + map.get(i));
        }


    }

    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();
        countLetters(myMap); // create map based on user input
            displayMap(myMap); // display map content
             }

    }

