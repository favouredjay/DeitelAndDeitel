package Chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMap {
    public static void main(String[] args) {
        Map<String, Integer> namesAndNumbers = new HashMap<>();
        namesAndNumbers.put("Bessie", 20);
        namesAndNumbers.put("Samuda", 2);
        namesAndNumbers.put("Jared", 31);
        System.out.println(namesAndNumbers);
        System.out.println(namesAndNumbers.get("Bessie"));

        Map<String, Integer> treeMap = new TreeMap<>(namesAndNumbers);
        System.out.println(treeMap);

    }
}
