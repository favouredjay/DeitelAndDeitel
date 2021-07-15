package chapterFour;
import java.util.Scanner;
public class ExerciseInChapter3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = input.nextInt();
        if( grade >= 90)
            System.out.println("Congratulation, Your pay is increase by 3%");
        else
            System.out.println("Your pay is increase by 1%");

    }
}
