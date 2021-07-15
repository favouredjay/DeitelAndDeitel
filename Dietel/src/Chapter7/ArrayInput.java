package Chapter7;
import java.util.Scanner;

public class ArrayInput {
//    public static void main(String[]args){
//    Scanner input = new Scanner(System.in);
//  String [] months = {"JANUARY","FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE" };
//
//        System.out.println("Enter number between 1 and 6");
//        int monthNumber = input.nextInt();
//        System.out.println("month is " + months[monthNumber -1]);
//
//}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int n = input.nextInt();
    double [] numbers = new double[n];
     double sum = 0;
    System.out.print("Enter the numbers: ");
     for (int i = 0; i < n; i++) {
         numbers[i] = input.nextDouble();
         sum += numbers[i];
         System.out.println();
         System.out.print(numbers[i]);
        }


}

}
