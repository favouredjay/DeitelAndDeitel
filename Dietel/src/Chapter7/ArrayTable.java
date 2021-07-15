package Chapter7;
import java.util.Scanner;
public class ArrayTable {
    public static void main(String[] args) {
        Scanner gradeInput = new Scanner(System.in);
        int [] grade = new int[10];
        System.out.println("Enter grades");
       int lowGrade = grade[0];
        for (int i = 0; i<grade.length; i++) {
            grade[i] = gradeInput.nextInt();
            if (grade[i] > lowGrade)
                lowGrade = grade[i];



        }
        System.out.println("The lowest grade is" + lowGrade);
            }




    }

