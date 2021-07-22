package Extras;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String binary = "";

        while(number != 0){
            int remainder = number%2;
             binary =  " " + remainder;
           number = number/2;
            System.out.println(binary);
        }

    }
}
