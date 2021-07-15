package Extras;

public class FlightMovie {



    public static boolean twoMoviesCanBeWatchedButUserCannotWatchTheSameMovieTwice(int [] movieArray, int flight_Length) {
        boolean isTrue = false;
        int j=0;
        for(int i = 0; i< movieArray.length; i++){
            for(j=0; j< i;j++)
            if(movieArray[i] + movieArray[j] == flight_Length){
                System.out.println("User can watch movie " + i + " and movie " + j);
                isTrue = true;


            }

        }

        return isTrue;
    }

    public static boolean isEqual(int flightLength, int[] movies){
        boolean isEqual = false;
        for (int i = 0; i < movies.length; i++) {
            for (int j = i + 1; j < movies.length; j++) {
                if(movies[i] + movies[j] == flightLength){
                    isEqual= true;
                }
                if(isEqual)
                    break;
            }
        }
        return isEqual;
    }

    public static void main(String[] args) {
        int[] movies = {120, 90, 60, 100, 60, 80,70};
        int flight_length = 120;
        FlightMovie.twoMoviesCanBeWatchedButUserCannotWatchTheSameMovieTwice(movies, flight_length);
    }

}
