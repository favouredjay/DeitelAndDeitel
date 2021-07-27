package Chapter16;

import java.util.*;


public class Set1 {

    public static void main(String[] args) {
        String[] colours = {"red", "blue", "yellow", "yellow", "blue"};
        List<String> list = Arrays.asList(colours);
        System.out.println(list);

        noDuplicate(list);


        SortedSet<String> set = new TreeSet<>(Arrays.asList(colours));
        System.out.println("Sorted Set :");
        System.out.println(set);

        System.out.println(set.headSet("red"));
        System.out.println(set.tailSet("red"));
        System.out.println(set.first());
        System.out.println(set.last());

    }
    public static void noDuplicate(Collection<String> values){
        Set<String> set = new HashSet<String>(values);
        for(String value : set)
            System.out.println( value);
        System.out.println();


    }
}
