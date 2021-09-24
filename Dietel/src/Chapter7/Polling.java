package Chapter7;

import java.util.Scanner;

public class Polling {
    static String[] causes = {"How many people participate in Election",
            "How bad is depression in Nigeria?",
            "On a scale of 1-10, How bad is Poverty?",
            "Rate Bullying in High Schools",
            "Rate Gender Inequality in Nigeria"};
    static int[][] ratings = new int[5][10];



    public static void displayEntireTable() {
        for (int j = 0; j < causes.length; j++) {
            System.out.print(causes[j] + " ");
            for (int i = 0; i < ratings[j].length; i++)
                System.out.printf("%2d", ratings[j][i]);

            System.out.println();

        }
    }



    public static void rateElection(int userRating) {
        int indexToIncrement = userRating - 1;
        ++ratings[0][indexToIncrement];

    }

    public static void rateDepression(int userRating) {
        int indexToIncrement = userRating - 1;
        ++ratings[1][indexToIncrement];
    }

    public static void ratePoverty(int userRating) {
        int indexToIncrement = userRating - 1;
        ++ratings[2][indexToIncrement];
    }
    public static void rateBullying(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[3][indexToIncrement];
    }
    public static void genderInequality(int userRating){
        int indexToIncrement =  userRating - 1;
        ++ ratings[4][indexToIncrement];

    }

    public static void getMaximumRating(){
        int maxFrequency = ratings[0][0];
        int maxRating = 1;
        for (int i = 1; i < ratings[0].length; i++) {
            if(maxFrequency < ratings[0][i]){
                    maxFrequency = ratings[0][i];
                    maxRating = i +1;
            }
        }
        System.out.println("The highest rating is " + maxRating);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Rate election");
            int userRating = input.nextInt();
            rateElection(userRating);
            System.out.println("Rate Depression");
            userRating = input.nextInt();
            rateDepression(userRating);
            System.out.println("Rate Poverty");
            userRating = input.nextInt();
            ratePoverty(userRating);
            System.out.println("Rate Bullying");
            userRating = input.nextInt();
            rateBullying(userRating);
            System.out.println("Rate Gender Inequality");
            userRating = input.nextInt();
            genderInequality(userRating);

        }
        displayEntireTable();
        getMaximumRating();
    }
}