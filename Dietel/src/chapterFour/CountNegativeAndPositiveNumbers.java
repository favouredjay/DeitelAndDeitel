package chapterFour;
import java.util.Scanner;

public class CountNegativeAndPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userInput = input.nextInt();

        int positiveValue = 0;
        int negativeValue = 0;
        double average = 0.0;
        double total = 0;
        int count = 0;
        while(userInput != 0) {
            if (userInput == 0){
                System.out.println(" Numbers entered are ");

            }
            count++;

            if (userInput > 0) {
                positiveValue = positiveValue + 1;
            }
            else {
                if (userInput < 0);
                negativeValue = negativeValue + 1;
            }
            total += userInput;
            System.out.println(" Enter another number ");
            userInput = input.nextInt();

            average = total / count;
        }
//        if (average != 0)


            System.out.println(" The Sum of the numbers are " + total);
            System.out.println(" Average is " + average);
            System.out.println(" Positive values are " + positiveValue);
            System.out.println(" Negative values are " + negativeValue);


    }

}
