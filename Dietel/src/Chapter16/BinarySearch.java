package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void binarySearch(List<String>list, String key){
        int result = 0;
        System.out.println("Searching for: " + key);
        result = Collections.binarySearch(list, key);
        if(result >= 0){
            System.out.println(key + " Found at index "+ result);
        }
        else {
            System.out.println(key + " not found " + result);
        }


    }

    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow",
                 "purple", "tan", "pink"};

        List<String>list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.println(list);

        binarySearch(list, "white");
        binarySearch(list, "teal");
        binarySearch(list, "red");
        binarySearch(list, "brown");


    }
}
