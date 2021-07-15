package chapter14;
import java.util.Scanner;
public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        for(int counter= 1; counter < 6; counter++){
        System.out.println("Enter a word");
        String text = input.nextLine();
        System.out.println("Enter a word");
        String text1 = input.nextLine();

        if(text.regionMatches(0,text1,0, 5)){
            System.out.println("First 5 characters match");
        }
        else {
            System.out.println("They don't match");

        }

    }
}
