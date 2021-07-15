package Chapter7;

public class SevenSegmentDisplay {

    static int[][] arrays = new int[5][4];

    public static void displayArray() throws InterruptedException {

        for (int[] i : arrays) {
            for (int j : i) {
                if (j == 1)
                    System.out.print("- ");
                else
                    System.out.print("  ");
//                Thread.sleep(1000);
            }
            System.out.println();
        }

    }

    public static void writeOnA() {
        for (int i = 0; i < arrays.length - 1; i++) {
            arrays[0][i] = 1;

        }
    }

    public static void writeOnB() {
        for (int j = 0; j < arrays[0].length - 2; j++) {
            arrays[j][3] = 1;

        }
    }


    public static void writeOnC() {
        for (int j = 2; j < arrays[0].length; j++) {
            arrays[j][3] = 1;

        }
    }

    public static void writeOnD() {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays[i].length; j++)
                arrays[4][i] = 1;

        }
    }

    public static void writeOnE() {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays[0].length; j++)
                arrays[i][0] = 1;

        }
    }

    public static void writeOnF() {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++)
                arrays[i][0] = 1;

        }
    }

    public static void writeOnG() {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays[i].length; j++)
                arrays[2][i] = 1;

        }
    }

    public static void setValue(String input) throws TerribleInputException {
//        decimalToBinary(29);
        for (int i = 0; i < input.length(); i++) {
            while (input.length() < 8) {
                input = "0" + input;

            }
            decimalToBinary(29);

            if (input.charAt(7) == '0') {
                input = " ";
            }
            if (input.charAt(i) == '1') {
                switch (i) {
                    case 0:
                        writeOnA();
                        break;
                    case 1:
                        writeOnB();
                        break;
                    case 2:
                        writeOnC();
                        break;
                    case 3:
                        writeOnD();
                        break;
                    case 4:
                        writeOnE();
                    case 5:
                        writeOnF();
                    case 6:
                        writeOnG();

                }
            }

        }

    }


    public static void validateValues(String input) throws TerribleInputException {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                throw new TerribleInputException();
            }
            if (input.length() > 8) {
                throw new TerribleInputException();
            }
        }
    }
    public static String decimalToBinary(int input) {
        StringBuilder binaryNumber = new StringBuilder();
        while (input != 0) {
            int modulo = input % 2;
            input = input / 2;
            binaryNumber.insert(0, modulo);
        }
        System.out.println(binaryNumber);
        return binaryNumber.toString();
    }







    public static void main(String[] args) throws InterruptedException, TerribleInputException {
        try {
            SevenSegmentDisplay.setValue(decimalToBinary(29));
        } catch (TerribleInputException e) {
            System.out.println("Terrible");
        }
        SevenSegmentDisplay.displayArray();
        SevenSegmentDisplay.decimalToBinary(29);
    }
}