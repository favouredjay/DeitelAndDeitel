package chapter5;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number = input.nextInt();
        int smallestNumber = 1;

        for(int i = 0; i<=10; i++){
            System.out.println("Enter numbers");
            number = input.nextInt();
            if (number < smallestNumber){
                smallestNumber = number;
            }

        } System.out.println("smallest number is " + smallestNumber);

    }
}
