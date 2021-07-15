//package Chapter16;
//
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//
//public class DuplicateWords2 {
//    private static void creaatingMap(Map<String ,Interger> map){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter a string");
//        String input=scanner.nextLine();
//
//        String[] tokens=input.split("");
//        for(String token:tokens){
//            String word=token.toLowerCase();
//            if(map.containsKey(word)) {
//                int count = map.get(word);
//                map.put(word, count + 1);
//            }
//            else;
//            map.put(word,1);
//            }
//        }
//
//private static void displayMap(Map<String,Integer> map){
//    Set<String ?keys=>map.keySet();
//}
//}