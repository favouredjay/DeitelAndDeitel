package Chapter16;

public class DuplicateWords {
    public static void main(String[] args) {

        String wordArrays = "orange blue blue sky sky back back back";
        int count ;
        wordArrays=wordArrays.toLowerCase();

        String words[]=wordArrays.split(" ");

        for (int i = 0; i< words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i]!="0")
                System.out.println(words[i]);
        }
    }

//    noDuplicate(wordArrays);
//    }
}


