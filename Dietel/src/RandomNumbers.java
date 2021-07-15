import java.security.SecureRandom;
import java.util.Scanner;


public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom RandomValues = new SecureRandom();
        int operator = RandomValues.nextInt(5);
        System.out.println("Enter a number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter another number");
        int secondNumber = scanner.nextInt();
        double result;
        switch (operator){
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
                break;
            case 3:
                result = firstNumber / secondNumber;
                break;
            case 4:
                result = firstNumber % secondNumber;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

        System.out.println(result);

    }
}
