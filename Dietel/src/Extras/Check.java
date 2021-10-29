package Extras;

public class Check {
//    public static void main(String[] args) {
//
//       IntStream value = IntStream.rangeClosed(1, 10)
//                .map((int x) -> {return x + 2;});
//        System.out.println(value);
//    }

    static String  joinWords(String [] word){
        String sentence = "";
        for(String w : word){
            sentence += w;
        }
        return sentence;

    }

    public static void main(String[] args) {
        String []word = new String[]{"a", "b", "c", "d", "e"};
        System.out.print(joinWords(word));

    }
}
