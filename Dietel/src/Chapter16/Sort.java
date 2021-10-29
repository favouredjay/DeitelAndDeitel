package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        String [] face = {"spade", "heart", "diamonds", "clubs"};
        List<String>list = Arrays.asList(face);

        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
