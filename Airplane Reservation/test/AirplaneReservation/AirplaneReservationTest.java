package AirplaneReservation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static AirplaneReservation.Seat.ECONOMY;
import static AirplaneReservation.Seat.FIRSTCLASS;
import static org.junit.jupiter.api.Assertions.*;
public class AirplaneReservationTest {

   AirplaneReservation airplaneReservation = new AirplaneReservation();


    @Test
    void testThatPlaneHasTenSeats(){

        assertEquals(10, airplaneReservation.getSeatCapacity());
    }
    @Test
    void testThatAllSeatsAreEmpty(){

        assertFalse(airplaneReservation.confirmEmptySeat());
    }
    @Test
    void testThatPlaneHasFirstClassSection() {

        airplaneReservation.firstClassSection(1);
        assertEquals(FIRSTCLASS, airplaneReservation.getFirstClassSection());
    }
    @Test
    void testThatPlaneHasEconomyClassSection(){
        airplaneReservation.setEconomyClassSection(2);
        assertEquals(ECONOMY, airplaneReservation.getEconomyClassSection());
    }
    @Test
    void testThatAllTenSeatsAreEmpty(){
        airplaneReservation.seatsAreEmpty();
        assertFalse(airplaneReservation.confirmEmptySeat());
    }
    @Test
    void testThatBothSectionsHaveFiveEmptySeatsEach(){
    assertEquals(FIRSTCLASS, airplaneReservation.firstClassHasFiveEmptySeats(1));
    assertEquals(ECONOMY, airplaneReservation.economyClassHasFiveEmptySeats(2));
    }
    @Test
    void testThatFirstClassSeatsCanBeAssigned(){
        assertEquals(true, airplaneReservation.pickFirstClassSeat(1));
        assertEquals(true, airplaneReservation.pickFirstClassSeat(1));
        assertEquals(true, airplaneReservation.pickFirstClassSeat(1));
        assertEquals(true, airplaneReservation.pickFirstClassSeat(1));
        assertEquals(true, airplaneReservation.pickFirstClassSeat(1));


    }
    @Test
    void testThatEconomyClassSeatsCanBeAssigned(){
        assertEquals(true, airplaneReservation.pickEconomySeat(2));
        assertEquals(true, airplaneReservation.pickEconomySeat(2));
        assertEquals(true, airplaneReservation.pickEconomySeat(2));
        assertEquals(true, airplaneReservation.pickEconomySeat(2));
        assertEquals(true, airplaneReservation.pickEconomySeat(2));





    }


}

