package chapterFour;
import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer \n Note program terminates when you enter zero: ");
        int userInput = input.nextInt();

        int sum = 0;
        while(userInput != 0) {
            sum += userInput;

            System.out.println("Enter an integer \n Note program terminates when you enter zero: ");
            userInput = input.nextInt();
        }
        System.out.println( " the sum is: " + sum);
    }
}
