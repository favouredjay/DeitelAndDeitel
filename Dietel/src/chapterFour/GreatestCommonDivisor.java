package chapterFour;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First integer");
        int firstInteger = input.nextInt();
        System.out.println("Enter Second Integer");
        int secondInteger = input.nextInt();
        int gcd = 1;
        for (int divisor = 2; divisor <= firstInteger && divisor <= secondInteger; divisor++) {
            if (divisor % firstInteger == 0 && divisor % secondInteger == 0)
                gcd = divisor;

                System.out.println("The Greatest common divisor of " + firstInteger + " and " + secondInteger + " = " + gcd);
        }
    }

}
