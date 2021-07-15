package Chapter7;

import java.util.Scanner;

public class PracticeMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row");
        int row = input.nextInt();
        System.out.println("Enter column");
        int column = input.nextInt();
        int[][] array = new int[row][column];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++)
                    System.out.print(array[i][j] + " ");

                System.out.println();
                }
            }


    }
