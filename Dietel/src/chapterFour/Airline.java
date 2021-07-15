package chapterFour;

import java.util.Scanner;

    public class Airline {

        public static void main(String[] args) {
            Boolean[] seatArray = new Boolean[11]; // create 10 seat numbers (array[0] will not be used).
            int planeSection;
            int seatCounterA = 0;
            int seatCounterB = 0;
            int loopCounter = 1;
            int firstClassCounter = 1;
            int secondClassCounter = 6;
            int limitA = 5;
            int limitB = 10;
            for (int i = 0; i < seatArray.length; i++) {
                seatArray[i] = false; // Empty seat indicated by false
            }


            Scanner input = new Scanner(System.in);
            while (loopCounter <= 10) {
                System.out.println();
                System.out.println("Please type 1 for Firstclass and 2 for Economy.");


                planeSection = input.nextInt();
                if (planeSection == 1 || planeSection == 2) {
                    if (planeSection == 1) {
                        if (seatArray[firstClassCounter] != true && firstClassCounter <= 5) {
                            seatArray[firstClassCounter] = true;
                            seatCounterA++;
                            System.out.println("Your seat number in the firstclass section is " + firstClassCounter);
                            firstClassCounter++;
                            if (seatCounterA == limitA && seatCounterB == limitB)
                                break;
                        } else {
                            System.out.println("Firstclass section is full. \nWould you like to be placed in the econnomy class?"
                                    + "\nIf yes press 1. If no press 2");
                            int choice = input.nextInt();
                            if (choice == 1) {
                                continue;
                            } else {
                                System.out.println("Next flight leaves in 3 hours");
                                break;
                            }
                        }
                    } else {
                        if (seatArray[secondClassCounter] != true && secondClassCounter <= 10) {
                            seatArray[secondClassCounter] = true;
                            seatCounterB++;
                            System.out.println("Your seat number in the economy section is " + secondClassCounter);
                            secondClassCounter++;
                            if (seatCounterA == limitA && seatCounterB == limitB)
                                break;
                        } else {
                            System.out.println("Economy section is full. \nWould you like to be placed in the firstclass?\nIf yes press 1. If no press 2");
                            int choice = input.nextInt();
                            if (choice == 1)
                                continue;
                            else {
                                System.out.println("Next flight leaves in 3 hours");
                                break;
                            }
                        }
                    }

                }
                loopCounter++;
            }
            System.out.println("Thank you for your patronage!!!");
        }
    }
