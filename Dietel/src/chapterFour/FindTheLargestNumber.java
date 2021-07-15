package chapterFour;

import java.util.Scanner;

public class FindTheLargestNumber {
//    public static void main(String[] args) {
public int largest(int values){
Scanner input = new Scanner(System.in);
int largestUnit = 1;
System.out.println("Enter sales Person's unit");
        values = input.nextInt();
        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("Enter sales Person's unit");
            values = input.nextInt();
            if (values > largestUnit)
                largestUnit = values;

        }

return largestUnit;
        }



}
