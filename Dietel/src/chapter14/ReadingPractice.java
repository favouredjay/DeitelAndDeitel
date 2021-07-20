package chapter14;

public class ReadingPractice {
    public static void main(String[] args) {


        String s = "JOY is my darling";
        char []charArray = new char[5];
        System.out.println("the reversed s is:");
        for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        s.getChars(0, 5, charArray, 0);
        for (char character : charArray)
            System.out.print(character);



    }
}
