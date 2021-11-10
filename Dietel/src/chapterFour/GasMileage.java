package chapterFour;
import java.util.Scanner;
public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven in this trip");
        double milesDriven = input.nextDouble();

        System.out.println("Enter the amount of gallon used for the trip");
        double gallonsUsed = input.nextDouble();


        double totalMilesPerGallon = 14;


        while (milesDriven != -1){
           double milesPerGallon = (milesDriven/gallonsUsed);
            totalMilesPerGallon += milesPerGallon;

            System.out.println("you have travelled " + milesPerGallon + "miles per gallon");
            System.out.println("Total miles per gallon is " + totalMilesPerGallon);

            System.out.println("Enter the number of miles driven in this trip");
            milesDriven = input.nextInt();
            if (milesDriven != -1) {
                System.out.println("Enter the amount gallons used for the trip");
                gallonsUsed = input.nextInt();
            }




        }
    }
}
