package Chapter16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection2 {
    public static void main(String[] args) {


        String[] colors = {"red", "blue", "black", "grey", "white"};
        List<String> list = new LinkedList<>();
        for (String color:colors)
        list.add(color);
        System.out.println(list);
        System.out.println();
        list.subList(0,2).clear();
        System.out.println(list);
        System.out.println();
        ListIterator<String>iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");

        }
        System.out.println();
        Collections.shuffle(list);
        System.out.println(list);

    }
}
