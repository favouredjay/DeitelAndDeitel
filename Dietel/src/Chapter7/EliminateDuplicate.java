package Chapter7;

import java.util.Scanner;

public class EliminateDuplicate {
    int[] arrays = new int[5];
    Scanner scanner = new Scanner(System.in);

    public int calculateEliminateDuplicate() {
        System.out.println("Enter numbers");
        int input = scanner.nextInt();
        for (int i = 0; i < arrays.length;i++ ) {
            System.out.println("Enter numbers");
            input = scanner.nextInt();
            boolean duplicate = input == arrays[i];
            if (duplicate) {
                throw new IllegalArgumentException("duplicate dude");
            } else arrays[i] = input;

            return arrays[i];

        }
        return 0;
    }
    public static void main(String[] args) {
        EliminateDuplicate eliminateDuplicate = new EliminateDuplicate();
        eliminateDuplicate.calculateEliminateDuplicate();
    }
}