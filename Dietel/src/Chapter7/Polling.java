//package Chapter7;
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class Polling {
//    static String[] causes = {"How many people participate in Election",
//            "How bad is depression in Nigeria?",
//            "On a scale of 1-10, How bad is Poverty?",
//            "Rate Bullying in High Schools",
//            "Rate Gender Inequality in Nigeria"};
//    static int[][] ratings = new int[5][10];
//    static int[] countArrays = new int[10];
//
//    public void setCauses() {
//        for (int i = 0; i < causes.length; i++) {
//            System.out.println(causes[i]);
//        }
//    }
//
//    public void displayTable() {
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[i].length; j++) {
//                System.out.print(ratings[i][j] + " ");
//                System.out.println();
//            }
//        }
//    }
//
//    public static void displayEntireTable() {
//        for (int j = 0; j < causes.length; j++) {
//            System.out.print(causes[j] + " ");
//            for (int i = 0; i < ratings[j].length; i++)
//                System.out.printf("%2d", ratings[j][i]);
//
//            System.out.println();
//
//        }
//    }
//
//    public static void validRating(int userRating) {
//        if (userRating < 1 || userRating > 10) {
//            throw new IllegalArgumentException("rating must be between 1 and 10");
//        }
//    }
//
//    public static void rateElection(int userRating) {
//        int indexToIncrement = userRating - 1;
//        ++ratings[0][indexToIncrement];
//
//    }
//
//    public static void rateDepression(int userRating) {
//        int indexToIncrement = userRating - 1;
//        ++ratings[1][indexToIncrement];
//    }
//
//    public static void ratePoverty(int userRating) {
//        int indexToIncrement = userRating - 1;
//        ++ratings[2][indexToIncrement];
//    }
//    public static void rateBullying(int userRating){
//        int indexToIncrement = userRating - 1;
//        ++ratings[3][indexToIncrement];
//    }
//    public static void genderInequality(int userRating){
//        int indexToIncrement =  userRating - 1;
//        ++ ratings[4][indexToIncrement];
//
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        rateElection();
//        displayEntireTable();
//
//    }
//}