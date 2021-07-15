package chapterFour;
import java.util.Scanner;

public class SeperateNumbers {
    public static void main(String[] args) {

        Scanner francis = new Scanner (System.in);

        System.out.println("Enter first value");
        int firstValue = francis.nextInt();

        System.out.println("Enter second value");
        int secondValue = francis.nextInt();

        System.out.println("Enter third value");
        int thirdValue = francis.nextInt();

        System.out.println("Enter fourth value");
        int fourthValue = francis.nextInt();

        System.out.println("Enter fifth value");
        int fifthValue = francis.nextInt();

        System.out.println(firstValue + " " + secondValue +" " + thirdValue + " " + fourthValue + " " + fifthValue);

    }
}
