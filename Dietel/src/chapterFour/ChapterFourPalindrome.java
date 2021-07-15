package chapterFour;

import java.util.Scanner;

public class ChapterFourPalindrome {
    public static void main(String[] args) {
        int digits = 0;
        int i = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        Scanner input = new Scanner(System.in);
        while (digits != 5) {
            System.out.println("Enter a five digit number");
            i = input.nextInt();
            if (i < 100000 && i > 9999) {
                digits = 5;
            } else
                System.out.println("Number must be 5 digits");
            firstNumber = i / 10000;
            secondNumber = i % 10000 / 1000;
            fourthNumber = i % 10000 % 1000 % 100 / 10;
            fifthNumber = i % 10;
            if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
                System.out.println("This is a Palindrome");
            } else {
                if
                (firstNumber != fifthNumber && secondNumber != fourthNumber) {
                    System.out.println("This is not a Palindrome");
                }
            }
        }
    }
}



