import java.security.SecureRandom;
import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
    SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        for (int randomNumberCounter = 1; randomNumberCounter <= 10; randomNumberCounter++) {

            int firstNumber = randomNumbers.nextInt(10);
            int secondNumber = randomNumbers.nextInt(10);

            int add = firstNumber + secondNumber;
            int subtract = firstNumber - secondNumber;
            int multiply = firstNumber * secondNumber;
            double divide = firstNumber / secondNumber;
            int modulus = firstNumber % secondNumber;

                double userInput;

                int operator =  1 + randomNumbers.nextInt(5);

                     switch (operator) {
                         case 1:
                             System.out.println(firstNumber+ " + " + secondNumber );
                             System.out.println("Input answer ");
                             userInput = input.nextDouble();
                             System.out.println(add);
                             if (userInput == add)
                                 System.out.println("My Guy");
//                             if (userInput != add)
                             else
                                 System.out.println("wrong");
                             break;
                         case 2:
                             System.out.println(firstNumber+ " - " + secondNumber );
                             System.out.println("Input answer ");
                             userInput = input.nextDouble();
                             if (userInput == subtract)
                                 System.out.println("My Guy");
                             if (userInput != subtract)
                                 System.out.println("wrong");
                            break;
                         case 3:
                             System.out.println(firstNumber+ " * " + secondNumber);
                             System.out.println("Input answer ");
                             userInput = input.nextDouble();
                             if (userInput == multiply )
                                 System.out.println("My Guy");
                             if (userInput != multiply)
                                 System.out.println("wrong");
                             break;
                         case 4:
                             System.out.println(firstNumber+ " / " +secondNumber);
                             System.out.println("Input answer ");
                             userInput = input.nextDouble();
                             if (userInput == divide)
                                 System.out.println("My Guy");
                             if (userInput != divide)
                                 System.out.println("wrong");
                             break;
                         case 5:
                             System.out.println(firstNumber+ " % " +secondNumber);
                             System.out.println("Input answer ");
                             userInput = input.nextDouble();
                             if (userInput == modulus)
                                 System.out.println("My Guy");
                             if (userInput != modulus)
                                 System.out.println("wrong");
                            break;
                     }
            }
    }
}
