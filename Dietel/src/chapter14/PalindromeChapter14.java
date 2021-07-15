package chapter14;
import java.util.Scanner;
public class PalindromeChapter14 {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);
        StringBuilder lucy = new StringBuilder();

        System.out.println("Enter a Word");
        String input = result.nextLine();
        for(int counter = input.length()- 1; counter>=0; counter-- ) {

            lucy.append(input.charAt(counter));
           if (result.equals(input.charAt(counter))) {

               System.out.println("is Palindrome");
           }
               else {
               System.out.println("Is not Palindrome");
           }



        }


    }
    }

