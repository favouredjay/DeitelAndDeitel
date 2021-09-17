package Extras;

import java.util.Scanner;

public class SarahAndTimmy {
    public static boolean inLove(){
    int petals = 0;
    boolean isInLove = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int sarah = input.nextInt();
        System.out.println("Enter another number");
        int timmy = input.nextInt();
        if(sarah%2 == 0 && timmy % 2 == 1){
            System.out.println("They are in love");
            return isInLove = true;
            }
        else{
            System.out.println("Not in love");
           return false;

            }
    }

    public static void main(String[] args) {
        System.out.println(inLove());
    }
    }

