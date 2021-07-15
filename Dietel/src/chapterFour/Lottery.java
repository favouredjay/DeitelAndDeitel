package chapterFour;
import java.security.SecureRandom;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int lottery = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        int userInput = input.nextInt();

        int lottery1 = lottery / 10;
        int lottery2 = lottery % 10;

        int userInput1 = userInput / 10;
        int userInput2 = userInput % 10;

        System.out.println("The lottery Number is " + lottery);

        if (lottery == userInput )
            System.out.println("Congratulations, You win $10,000");
        if (lottery1 == userInput2 && lottery2 == userInput1)
            System.out.println("Match all digits : You win $3,000 ");
        if (lottery1 == userInput1 || lottery1 == userInput2 || lottery2 == userInput1 || lottery2 == userInput2)
            System.out.println("You win $1,000");
        else System.out.println("You won nothing");
    }

}
