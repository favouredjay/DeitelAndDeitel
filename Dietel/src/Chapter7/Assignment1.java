package Chapter7;

public class Assignment1 {

    public static void main(String[] args) throws InterruptedException {


        int[][] arrays = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        for (int[] i : arrays) {
            for (int j : i) {
                if (j == 1)
                    System.out.print("- ");
                else
                    System.out.print("  ");
                Thread.sleep(1000);
            }
            System.out.println();
        }

    }
    }


