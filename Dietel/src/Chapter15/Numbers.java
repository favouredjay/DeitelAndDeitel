//package Chapter15;
// import java.io.IOException;
//import java.nio.file.Paths;
// import java.util.Formatter;
// import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//    public class Numbers {
//
//        private static Scanner input;
////        private static Formatter formatter;
//
//        public static void openFile() {
//            try {
//                input = new Scanner(Paths.get("numbers.txt"));
//                Formatter formatter = new Formatter("output.txt");
//
//            } catch (IOException ioException) {
//                System.err.println("Error opening file. Terminating.");
//                System.exit(1);
//            }
//        }
//
//        public static void readResponses() throws IOException {
//            int [] frequency = new int[6];
//            System.out.printf("%s%10s%n", "Response", "Frequency");
//            try {
//
//                while (input.hasNextInt()) {
//                    int answer = input.nextInt();
//                    try {
//                        ++frequency[answer];
//                    } catch (ArrayIndexOutOfBoundsException e) {
//                        System.out.println(e);
//                    }
//                }
//            } catch (NoSuchElementException elementException) {
//                System.err.println("File improperly formed. Terminating.");
//            } catch (IllegalStateException stateException) {
//                System.err.println("Error reading from file. Terminating.");
//            }
//        }
//        public static void printResponses(int[] frequency){
//            try {
//
//            }
//        }
//        public static void closeFile() {
//            if (input != null) input.close();
//        }
//
//        public static void main(String[] args) throws IOException {
//            openFile();
//            readResponses();
//            closeFile();
//        }
//    }
//
