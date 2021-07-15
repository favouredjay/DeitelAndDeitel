package chapter5;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        int stars = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = stars; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            stars++;


            int asterick = 10;
            for (int y = 10; y > 0; y--) {
                for (int j = asterick; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
                asterick--;
            }

            int s = 10;
            for (int k = 10; k > 0; k--) {
                for (int j = s; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
                s--;
            }
            int space = 0;
            int starz = 10;
            for (int x = 0; x < 10; x++) {

                for (int f = space; f > 0; f--) {
                    System.out.print(" ");
                }
                space++;
                for (int i1 = starz; i1 > 0; i1--) {
                    System.out.print("*");
                }
                starz--;
                System.out.println();
            }


            for (int t = 0; t < 10; t++) {
                for (int spaces = 10; spaces > t; spaces--) {
                    System.out.print(" ");

                }

                for (int starss = 0; starss < t; starss++) {
                    System.out.print("*");
                }
                System.out.println();


            }
        }

    }
}
