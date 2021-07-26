package Chapter16;

import java.util.*;

public class Collection1 {
    public static void removeItem(Collection<String>collection, Collection<String>collection1){
        Iterator<String>iterator = collection.iterator();

        while(iterator.hasNext()){
            if(collection1.contains(iterator.next())){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

        String []colors = {"BLUE", "RED", "ORANGE", "GREEN"  };
        List<String> list = new ArrayList<>();
//        list.addAll(Arrays.asList(colors));
        list.addAll(Arrays.asList(colors));

        String [] removeColors = {"GREEN", "RED"};
        List<String> removeList = new ArrayList<>();
        for(String removeColor: removeColors)
        removeList.add(removeColor);

        removeItem(list, removeList);

        for(String color: list)
            System.out.println(color);

    }
}
