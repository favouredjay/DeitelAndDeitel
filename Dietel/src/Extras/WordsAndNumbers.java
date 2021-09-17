package Extras;

public class WordsAndNumbers {
   public static String order (String words){
        int temp;

        int j;
        boolean isDigit = false;
//        words = "gir2l ba4d G1ood gone3";
//        boolean isGreater = Character.isDigit(Integer.parseInt(String.valueOf(words.charAt(i)))) > Character.isDigit(Integer.parseInt(String.valueOf(words.charAt(j))));

//        StringBuilder appendWord = new StringBuilder();
//        for (i = 0; i < words.length() - 1; i++) {
//            for (j = i + 1; j < words.length(); j++) {
//                if (!Character.isDigit(words.length())) {
//                    continue;
//                }
//                isDigit = true;
//                break;
//            }
//            if (isDigit &&  words.charAt(i) > words.charAt(j))
//                appendWord.insert(0,words);
//        }
//        System.out.println(appendWord);

//        char [] letter = words.toCharArray();
//        Arrays.sort(letter);
//        System.out.println(String.valueOf(letter ));

//   String [] sortedSentence = Arrays.copyOf()
//
//        String[] arrange = words.split("");
//        for ( i = 0; i < arrange.length ; i++) {
//            for(j = 0; j < words.length();j++){
//                if(!Character.isDigit(words.length()) || !Character.isDigit(arrange.length))
//                    continue;
//                isDigit = true;
//                break;
//              if(isDigit && words.charAt(j) > )
//        if(words.length() == 0) return "";
       StringBuilder appendWord = new StringBuilder();
       String[] wordArray = words.split(" ");
       String [] array = new String[wordArray.length];
       int digit = 0;

       for (String s: wordArray){
           for (int i = 0; i < s.length(); i++){
               if( Character.isDigit(s.charAt(i))){
                   digit = Integer.parseInt(Character.toString(s.charAt(i)));
                   break;
               }
           }
           array[digit-1] = s;
       }
            for(String s : array){
                appendWord.append(s).append(" ");
            }
            return appendWord.substring(0, appendWord.length());
            }

    public static void main(String[] args) {
        System.out.println( order("gir2l ba4d G1ood gone3"));
    }
        }



