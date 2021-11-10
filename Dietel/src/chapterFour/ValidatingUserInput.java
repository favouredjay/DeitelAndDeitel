package chapterFour;


import java.util.Scanner;

public class ValidatingUserInput {
    Scanner userInput = new Scanner(System.in);
    public int validateInput(){
        int input = 1;
        int otherInput = 2;
        System.out.println("Enter number");
        int number = userInput.nextInt();

        while(number != input && number != otherInput){
            System.out.println("Enter number");
            number = userInput.nextInt();


        }
        return number;
    }

    public static void main(String[] args) {
        ValidatingUserInput userInput = new ValidatingUserInput();
        userInput.validateInput();
    }
}
