package Chapter6;
import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int digits = 0;
        int i = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        while (digits != 4) {
            System.out.println("Enter a four digit number");
            i = input.nextInt();
            if (i < 10000 && i > 999) {
                digits = 4;
            } else
                System.out.println("Number must be 4 digits");
            firstNumber = i / 1000;
            secondNumber = i % 1000 / 100;
            thirdNumber = i % 1000 % 100 /10;
            fourthNumber = i % 10;

            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber);

        }
        }

}
