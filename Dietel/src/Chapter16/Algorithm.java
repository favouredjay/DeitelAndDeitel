package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm {

    public static void output (List<Character>list){
        System.out.println("Elements are: ");
        for (Character element : list){
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

    }

    public static void main(String[] args) {
        Character[]letters = {'p', 'c', 'm'};
        List<Character>list = Arrays.asList(letters);
        output(list);

        Collections.reverse(list);
        output(list);

        Collections.sort(list);
        output(list);

        Collections.fill(list, 'r');
        output(list);
    }
}
