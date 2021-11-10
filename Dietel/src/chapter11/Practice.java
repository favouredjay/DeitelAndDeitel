package chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Enter first number");
                int number1 = input.nextInt();

                System.out.println("Enter second number");
                int number2 = input.nextInt();

                int result = (number1 / number2);
                System.out.println("FIRST " + number1 + "\n" + "SECOND " + number2 + "\n" + "RESULT " + result);

                continueLoop = false;
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n",
                        e);
                input.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");

            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }

        }while (continueLoop) ;



    }
}
