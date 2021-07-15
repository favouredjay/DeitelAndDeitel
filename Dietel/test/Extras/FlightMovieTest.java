package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightMovieTest {

    FlightMovie movie = new FlightMovie();


    @Test
    void movieCanBeTested(){
        assertNotNull(movie);
    }

    @Test
    void TestThatPassengersCanWatchTwoMovies(){

        int [] movieArray ={60, 20, 30, 40, 20, 50, 40};
        assertTrue(movie.twoMoviesCanBeWatchedButUserCannotWatchTheSameMovieTwice(movieArray, 100));

    }

}