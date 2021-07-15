package Chapter7;
import java.util.Random;
import java.util.Scanner;
public class AirplaneReservation {
    public static void main(String[] args) {
        Boolean [] array = new Boolean[11];
        int planeSection = 1;
        int firstClassCounter = 1;
        int economyCounter = 6;
        int  limitFirstClass = 5;
        int limitEconomy = 11;
        int counter =1;

        Random randomLetter = new Random();
        char c = (char)(randomLetter.nextInt()+ 'A');


        for (int i = 0; i< array.length; i++) {
            array[i] = false;
        }

        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Please type 1 for First Class and 2 for Economy");
            planeSection = input.nextInt();

            if (planeSection == 1 || planeSection == 2) {
                if (planeSection == 1){
                    if (!array[firstClassCounter] && firstClassCounter <= 5) {

                        array[firstClassCounter] = true;

                        System.out.println("BOARDING PASS for Mr" + c + "\nFIRST CLASS \n Your Seat Number is " + firstClassCounter);
                        firstClassCounter++;
                        if (firstClassCounter == limitFirstClass && economyCounter == limitEconomy)
                            break;
                    } else
                        System.out.println("Seat is full, \n Would you like a seat in Economy? \n Press 2 if yes and 1 if no");
                        planeSection = input.nextInt();
                        if (planeSection == 1) {
                            continue;}
                            else{
                            System.out.println("Next Flight leaves in 3 hours");

                        }
                    }
                else {
                    if (!array[economyCounter] && economyCounter <= 11) {
                        array[economyCounter] = true;
                        System.out.println("BOARDING PASS for Mr " + c + "\n ECONOMY \n Your Seat Number is" + economyCounter);
                        economyCounter++;
                        if (economyCounter == limitEconomy)
                            break;

                    } else {
                        System.out.println("Seat is full, \n Would you like a seat in First Class? \n Press 1 if yes and 2 if no");
                        planeSection = input.nextInt();
                        if (planeSection == 2) {
                            System.out.println("Next Flight leaves in 3 hours");
                        }
                    }
                }


            }
            counter++;
        }
        }
    }
