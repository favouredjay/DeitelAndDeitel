import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {

    @Test
    void availableClassType_canBeChecked() {
        AirlineReservation airlineReservation = new AirlineReservation();

        airlineReservation.checkAvailableClass("Business");

        assertEquals("Business", airlineReservation.getAvailableClassTypes());
    }

    @Test
    void differentClassType_canBeSelected() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.checkAvailableClass("Business");

        assertEquals("Business", airlineReservation.getAvailableClassTypes());
        airlineReservation.checkAvailableClass("First Class");
        assertEquals("First Class", airlineReservation.getAvailableClassTypes());
    }

    @Test
    void canCheckThatAllSeatsAreEmpty() {
        AirlineReservation airlineReservation = new AirlineReservation();

        assertEquals(false, airlineReservation.getSeatNumber(10));
    }

    @Test
    void canBookFlight() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.checkAvailableSeatInFirstClass(1);
    }

    //    @Test
//    void passenger_canBookFirstClass(){
//        AirlineReservation airlineReservation = new AirlineReservation();
//        airlineReservation.canBookFirstClass()
//    }
    @Test
    void checkThatPassengerCanBookFirstClass() {
        AirlineReservation airlineReservation = new AirlineReservation();


    }

    @Test
    void checkForAvailableSeatsInFirstClass() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        airlineReservation.checkAvailableSeatInFirstClass(1);
        assertEquals(false, airlineReservation.getAvailableSeatInFirstClass());
    }


    @Test
    void checkForAvailableSeatsInEconomy() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.checkAvailableSeatInEconomy(2);
        airlineReservation.checkAvailableSeatInEconomy(2);
        airlineReservation.checkAvailableSeatInEconomy(2);
        airlineReservation.checkAvailableSeatInEconomy(2);
        airlineReservation.checkAvailableSeatInEconomy(2);
//        airlineReservation.checkAvailableSeatInEconomy(2);

    }


//    @Test
//    void seatCanBeAssignedToPassenger() {
//        AirlineReservation airlineReservation = new AirlineReservation();
//        airlineReservation.assignSeatToPassenger()
//    }
//    }


//    @Test
//    void seatNumbers_canBeCreatedToClassType(){
//        AirlineReservation airlineReservation = new AirlineReservation();
//        int [] seatNumber = {1};
//        airlineReservation.creatSeatNumbers(seatNumber);
//
//        assertEquals(1, airlineReservation.getAvailableSeatNumbers());
//    }
//
////    @Test
//    void seatNumber_canBeAssigned(){
//        AirlineReservation airlineReservation = new AirlineReservation();
//        boolean [] availableSeats = new boolean[10];
//        availableSeats[1] = true;
//        airlineReservation.generateSeatNumber("First Class");
//
//        assertTrue(airlineReservation.getSeatNumber(1));
//    }
}

