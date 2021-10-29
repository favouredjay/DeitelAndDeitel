package Chapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class AsArray {
    public static void main(String[] args) {
        String[] food = {"rice", "beans", "plantain", "soup"};
        LinkedList <String> list = new LinkedList<>(Arrays.asList(food));
        String [] food1 = {"ice-fish"};
        LinkedList <String> list1 = new LinkedList<>(Arrays.asList(food1));
        list.add("fish");
        list.addFirst("chicken");
        list.addLast("egusi");
        list.add(0,"bayleaf");
        list.addAll(list1);
        food = list.toArray(new String[0]);
        for(String i : food){
            System.out.println(i);
        }

    }
}
