package chapter5;
import java.util.Scanner;
public class TaxPlanAlternativeMain {
    public static void main(String[] args) {
        TaxPlanAlternative alternative = new TaxPlanAlternative();
        Scanner input = new Scanner(System.in);
        String message = """
                Enter 1 for Housing,
                Enter 2 for Food,
                Enter 3 for Clothing,
                Enter 4 for Transportation
                Enter 5 for Education,
                Enter 6 for Healthcare,
                Enter 7 for Vacation
                           
                """;
        for (int counter = 1; counter <= 7; counter++) {

        System.out.println(message);
        System.out.println("Enter number between 1 and 7");
        int userInput = input.nextInt();
            if(userInput <= 0 || userInput > 7) {
                System.out.println("Invalid,\nEnter number between 1 and 7");
                System.out.println(message);
                System.out.println("Enter number between 1 and 7");
                userInput = input.nextInt();
                }
                System.out.println("Please pay for your service");
                double amount = input.nextInt();
                alternative.setTotalAmount(amount);
                System.out.println("Vat is $0.23 \nAmount to pay is "+ (alternative.getTotalAmount() + amount));

        }
    }
}