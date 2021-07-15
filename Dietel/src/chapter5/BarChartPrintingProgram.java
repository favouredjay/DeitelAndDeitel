package chapter5;
import java.util.Scanner;
public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            System.out.println("Enter number");
            int number = input.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = input.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber = input.nextInt();
        System.out.println("Enter Fourth Number");
        int fourthNumber = input.nextInt();
        System.out.println("Enter Fifth Number");
        int fifthNumber = input.nextInt();


        String asterisks = "*";
        for (int j = 1; j <= 5 ; j++) {
            asterisks += "*";
            System.out.println(asterisks);
        }
    }
    }

