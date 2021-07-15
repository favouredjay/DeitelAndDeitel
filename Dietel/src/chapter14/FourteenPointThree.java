package chapter14;
import java.util.Scanner;
public class FourteenPointThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String firstInput = input.nextLine();
        System.out.println("Enter another word");
        String secondInput = input.nextLine();

        int result = firstInput.compareToIgnoreCase(secondInput);
        System.out.println(result);

        if (result > 0){
            System.out.println("First input is greater than second input");
        }
        if(result == 0){
            System.out.println("First input is equal to second input");
        }
        if(result < 0){
            System.out.println("First Input is less than second input");
        }

    }
}
