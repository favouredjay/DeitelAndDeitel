package chapterFour;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in meters: ");
        double height = sc.nextDouble();

        System.out.println("Enter Weight in kilometers: ");
        double weight =sc.nextDouble();

        double bmi;
        bmi = weight / (height * height);

        System.out.println("");
        System.out.println("Your BMI is " + bmi);
        System.out.println("");
        System.out.println("BMI VALUES");
        System.out.println("Underweight: \tless than 18.5");
        System.out.println("Normal: \tbetween 18.5 and 24.9");
        System.out.println("Overweight: \tbetween 25 and 29.9");
        System.out.println("Obese: \t\t30 or greater");





    }
}
