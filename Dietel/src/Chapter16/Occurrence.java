package Chapter16;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Occurrence {
    public static void main(String[] args) {
        String text = "Good Girl Gone Bad";

        Map<String, Integer> treeMap = new TreeMap<>();

        String[] letter = text.split("\\s");
        for (int i = 0; i < letter.length; i++) {
            String keys = letter[i].toLowerCase();

            if (keys.length() > 0) {
                if (!treeMap.containsKey(keys)) {
                    treeMap.put(keys, 1);
                } else {
                    int value = treeMap.get(keys);
                    value++;
                    treeMap.put(keys, value);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();

        for(Map.Entry<String, Integer>entry : entrySet){
            System.out.println(entry.getValue() + " - " + entry.getKey());

        }
    }
}