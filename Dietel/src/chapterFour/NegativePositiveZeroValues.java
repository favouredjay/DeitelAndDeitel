package chapterFour;

import java.util.Scanner;

public class NegativePositiveZeroValues {
    public static void main(String[] args) {

        Scanner kingsley = new Scanner(System.in);

        int firstValue;
        System.out.println("Enter first value");
        firstValue = kingsley.nextInt();
        int secondValue;
        System.out.println("Enter second value");
        secondValue = kingsley.nextInt();
        int thirdValue;
        System.out.println("Enter third value");
        thirdValue = kingsley.nextInt();
        int fourthValue;
        System.out.println("Enter fourth value");
        fourthValue = kingsley.nextInt();
        int fifthValue;
        System.out.println("Enter fifth value");
        fifthValue = kingsley.nextInt();

        int zeroValue = 0;
        zeroValue*=0;
        int positiveValue = 0;
        int negativeValue = 0;

        if (firstValue > 0)
            positiveValue = positiveValue + 1;
            if (firstValue < 0)
                negativeValue = negativeValue + 1;
            if (firstValue == 0)
                zeroValue = zeroValue + 1;

        if (secondValue > 0)
            positiveValue = positiveValue + 1;
            if (secondValue < 0)
                negativeValue = negativeValue + 1;
            if (secondValue == 0)
                zeroValue = zeroValue + 1;

        if (thirdValue > 0)
            positiveValue = positiveValue + 1;
            if (thirdValue < 0)
                negativeValue = negativeValue + 1;
            if (thirdValue == 0)
                zeroValue = zeroValue + 1;

        if (fourthValue > 0)
            positiveValue = positiveValue + 1;
            if (fourthValue < 0)
                negativeValue = negativeValue + 1;
            if (fourthValue == 0)
                zeroValue = zeroValue + 1;

        if (fifthValue > 0)
            positiveValue = positiveValue + 1;
            if (fifthValue < 0)
                negativeValue = negativeValue + 1;
            if (fifthValue == 0)
                zeroValue = zeroValue + 1;


        System.out.println("Number of positive Value(s) is/are  :" + positiveValue);
        System.out.println("Number of negative Value(s) is/are  :" + negativeValue);
        System.out.println("Number of zero Value(s) is/are  :" + zeroValue);





    }

}
