package Extras;

public class WordsAndNumber2 {
    public static void main(String[] args) {
        String [] words = {"gir2l"," ba4d ","G1ood ","gone3"};
        String[] s1 = words[0].split("");
        String[] s2 = words[1].split("");
        String[] s3 = words[2].split("");
        String[] s4 = words[3].split("");

        StringBuilder buffer = new StringBuilder();
        buffer.insert(0,s2);
        buffer.insert(0,s4);
        buffer.insert(0,s1);
        buffer.insert(0,s3);

        System.out.printf("%s", buffer);



    }
}
