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
    private static void removeList(List<String> list, int start, int end){
        list.subList(start, end).clear();

    }

    public static void main(String[] args) {

        String []colors = {"BLUE", "RED", "ORANGE", "GREEN"  };
        List<String> list = new LinkedList<>();
//        list.addAll(Arrays.asList(colors));
        for(String color: colors)
        list.add(color);

        String [] colors2 = {"teal", "BROWN"};
        List <String> list1 = new LinkedList<>();
        for (String color: colors2){
            list1.add(color);
        }
        list1.addAll(list);

        Collections.sort(list1);
        System.out.println("Combination of the two lists is: " + list1);
        String [] removeColors = {"GREEN", "RED"};
        List<String> removeList = new ArrayList<>();
        for(String removeColor: removeColors)
        removeList.add(removeColor);


        ListIterator <String> iterator = list1.listIterator(list1.size());
        System.out.println("backwards:");
        while(iterator.hasPrevious()){

        System.out.print(iterator.previous() + ", ");}
        removeItem(list, removeList);
        removeList(list1, 1,5);
        System.out.println();
        System.out.println("items left are "+ list1);

        for(String color: list)
            System.out.println(color);

    }
}
