package Chapter18;

import java.util.Scanner;

public class Factorial {
    public static long factorials(long number){
        if(number <= 0){
            return 1;
        }
        else return number * factorials(number-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        System.out.println("The factorial of " + number + " is " + factorials(number));
    }
}
