package Extras;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
       String octal = "";
       int remainder;
        while(number != 0){
             remainder = number%8;
            octal = "" + remainder;
            number = number/8;
            System.out.println(octal);

        }
    }
}
