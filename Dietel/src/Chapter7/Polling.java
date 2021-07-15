package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class Polling {
    static String[] causes = {"How many people participate in Election",
            "How bad is depression in Nigeria?",
            "On a scale of 1-10, How bad is Poverty?",
            "Rate Bullying in High Schools",
            "Rate Gender Inequality in Nigeria"};
    static int[][] ratings = new int[5][10];
    static int [] countArrays = new int[10];

    int counter = 0;
    SecureRandom secureRandom = new SecureRandom();

    public void setCauses() {
        for (int i = 0; i < causes.length; i++) {
            System.out.println(causes[i]);
        }
    }

    public void displayTable() {
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print(ratings[i][j] + " ");
                System.out.println();
            }
        }
    }

    public static void displayEntireTable() {
        for (int j = 0; j < causes.length; j++) {
            System.out.print(causes[j] + " ");
            for (int i = 0; i < ratings[j].length; i++)
                System.out.printf("%2d", ratings[j][i]);

            System.out.println();

        }
    }

    public static void validRating(int userRating) {
        if (userRating < 1 || userRating > 10) {
            throw new IllegalArgumentException("rating must be between 1 and 10");
        }
    }
    public static void rateElection1(){
            Scanner scanner=new Scanner(System.in);
              int i =0;
                    System.out.println("Rate Election");
                    int RateElection=scanner.nextInt();
//                    ratings[0][i]=RateElection;
                countArrays[ratings[0][i]]++;
            }


    public static void rateBullying(){

    }

//    public static void rateSocialConsciousness(int userRating, int index) {
//
//        Scanner input = new Scanner(System.in);
//
//
//
//
//            switch (userRating) {
//                case 1:
//                    int[] countArray = new int[10];
////                    for (int i = 0; i < countArray.length; i++) {
////                        countArray[i] = i + 1;
//                    System.out.println("Rate Election");
//                    int userInput = input.nextInt();
//                    countArray[ratings[0][index] - 0]++;
//                    break;
//                case 2:
//                    System.out.println("Rate Depression");
//                    ratings[1][index] = userRating++;
////                ++userRating;
//                    break;
//                case 3:
//                    System.out.println("Rate Poverty");
//                    ratings[2][index] = userRating;
//                    ++userRating;
//                    break;
//                case 4:
//                    System.out.println("Rate Bullying");
//                    ratings[3][index] = userRating;
//                    ++userRating;
//                    break;
//                case 5:
//                    System.out.println("Rate Gender inequality");
//                    ratings[4][index] = userRating;
//                    ++userRating;
//                    break;
//            }
//            displayEntireTable();
//        }
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        int index = 0;

        rateElection1();
        displayEntireTable();

    }
}