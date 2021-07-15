package Chapter16;

import java.util.*;

public class Chapter16point16 {

    public static void noDuplicate(Map<String, Integer> map, String[] words) {
        for (String value : words ) {
            if(map.get(value) != null){
                map.put(value, map.get(value + 1));
            }
            else map.put(value , 1);
        }
        Set<String>keySet =  map.keySet();
        for (String value:keySet){
            if (map.get(value)> 1)
                System.out.println(value);
        }
    }
    public static void main(String[] args) {
        String [] words = {"blue, ocean, blue, beautiful, cohort, cohort"};
//        String[] expression = words.split("\\W");
        Map<String, Integer>map = new HashMap<>();
        noDuplicate(map, words);
    }



}
