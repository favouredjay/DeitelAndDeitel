package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        String [] colors = {"pink", "blue", "teal"};
        LinkedList<String>list = new LinkedList<>(Arrays.asList(colors));
        list.add(2, "magenta");
        list.addFirst("black");
        list.addFirst("purple");


        list.addLast("cyan");
        list.add("yellow");
        System.out.println(list);

        List<String> link = Arrays.asList(colors);
        Collections.sort(link,  Collections.reverseOrder());

        System.out.println(link);
    }
}
