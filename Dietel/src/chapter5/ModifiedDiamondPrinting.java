package chapter5;
import java.util.Scanner;
public class ModifiedDiamondPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
        int number = input.nextInt();
        int spaces = number;
        int lines = number;
        int stars = 1;
        int div = lines/2+1;
        if (number%2 == 1 && number>1 && number <19)

        for(int i = 1; i <=lines; i++){

            for (int s = spaces; s>0; s--) {
                System.out.print(" ");
            }
            for (int a = stars; a>0; a--){
                System.out.print("* ");
            }

            System.out.println();
            if(i<div) {
                spaces -= 2;
                stars += 2;
            } else if (i >= div) {
                spaces += 2;
                stars -= 2;
            }
        }
    }
}
