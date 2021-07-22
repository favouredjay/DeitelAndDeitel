package Extras;

import java.util.Scanner;

public class PositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveValue = 0;
        int negativeValue = 0;
        int zero = 0;
        int total = 0;
        int count = 0;
        System.out.println("Enter numbers: ");
        while (input.hasNext()) {
            System.out.println("Enter numbers: ");
            int number = input.nextInt();
            if (number > 0)
                ++ positiveValue;
            else if (number == 0)
                ++ zero;
            else ++ negativeValue;
        total += number;
            count++;
        }

        double average = total/count;
        System.out.println("Positive Values are: " + positiveValue +"\nNegative Values are: " + negativeValue + "\nZeros are: " + zero);
        System.out.println("total is: " + total + "\nAverage is: " + average + "\ncount is: " + count);

    }
}