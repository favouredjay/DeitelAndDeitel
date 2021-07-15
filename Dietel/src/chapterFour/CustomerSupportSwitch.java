package chapterFour;

import java.util.Scanner;
public class CustomerSupportSwitch {
    public static void main(String[] args) {
        String promptMessage = """
               Press 1 for Igbo,
               Press 2 for Hausa,
               Press 3 for Yoruba,
               Press 4 for English
               """;
        System.out.println(promptMessage);
        Scanner userInputCollector = new Scanner(System.in);
        int userInput = userInputCollector.nextInt();
        switch(userInput){
            case 1:
                System.out.println("Igbo Kwenu!!");
                break;
            case 2:
                System.out.println("Aboki Kwenu!!");
                break;
            case 3:
                System.out.println("Omo-onile Kwenu!!");
                break;
            case 4:
                System.out.println("Hello Pink people!!");
            default:
                System.out.println("Get lost!!");

        }
    }
}
