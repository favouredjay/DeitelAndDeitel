package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algorithm2 {
    public static void main(String[] args) {


        String[] color = {"red", "white", "yellow", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(color));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("black");
        list2.add("purple");
        list2.add("yellow");
        list2.add("yellow");

        for(String s : list2){
            System.out.println(s + ", ");
        }

        Collections.addAll(list2,color);

        for (String s : list2){
            System.out.print(s + ", ");
        }
        int frequency = Collections.frequency(list2,"yellow");
        System.out.println();
        System.out.println("yellow appears " + frequency + " times");

        boolean disjoint = Collections.disjoint(list, list2);
        System.out.println("List and List2 " +(  disjoint? "do not have": "have") + " elements in common" );
    }
}
