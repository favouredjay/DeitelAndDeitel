//1. Seat array of size of 10.
//2. divide 10 by two and call one class first class and the other class economy.
//3. assign five seats to the first class and the other five to economy.
//4. Check that all the seats are empty by initializing them to false.
//5. A seat becomes true when a passenger has been assigned that seat and one seat cannot be assigned seat twice.
//6. Print boarding pass to passenger that seats have been assigned to.
//7. when a class is full, ask passenger if he/she would like to seat in the other class, passenger says yes then book them but if passenger
//says no, write out a message that says 'next flight leaves in 3 hours.'


package AirplaneReservation;

import static AirplaneReservation.Seat.ECONOMY;
import static AirplaneReservation.Seat.FIRSTCLASS;

public class AirplaneReservation {

    boolean[] seatArray = new boolean[10];
    private Seat firstClassSection;
    private Seat economyClassSection;
    private int firstClassLimit = 4;

    public Seat getFirstClassSection() {
        return firstClassSection;
    }

    public Seat getEconomyClassSection() {
        return economyClassSection;
    }

    public int getSeatCapacity() {
        return seatArray.length;
    }

    public boolean confirmEmptySeat() {
        for (int i = 0; i < seatArray.length; i++)
            seatArray[i] = false;
        return false;
    }

    public void firstClassSection(int planeSection) {
        if (planeSection == 1 || planeSection == 2) {
            if (planeSection == 1) {
                firstClassSection = FIRSTCLASS;
            }
        }
    }

    public void setEconomyClassSection(int planeSection) {
        if (planeSection == 2) {
            economyClassSection = ECONOMY;
        }
    }

    public void seatsAreEmpty() {
        for (boolean numberOfSeats : seatArray)
            System.out.println(numberOfSeats);
    }

    public Seat firstClassHasFiveEmptySeats(int planeSection) {
        if (planeSection == 1) {
            firstClassSection = FIRSTCLASS;
            for (Seat seat : Seat.values())
                if (seat == FIRSTCLASS) {
                    for (int i = 0; i < seatArray.length; i++) {

                        if (i == 5)
                            break;
                        System.out.println(false);

                    }
                }
            System.out.println();
        }
        return firstClassSection;
    }

    public Seat economyClassHasFiveEmptySeats(int planeSection) {
        if (planeSection == 2) {
            economyClassSection = ECONOMY;
            for (Seat seat : Seat.values()) {
                if (seat == ECONOMY) {
                    for (int i = 0; i < seatArray.length; i++) {
                        if (i < 5)
                            continue;
                        System.out.println(false);
                    }
                }
            }
        }
        return economyClassSection;
    }


    public boolean pickFirstClassSeat(int planeSection) {
        int i;
        for (i = 0; i < seatArray.length/2; i++) {
            if (!seatArray[i]) {
                System.out.println("Your seat number is " + (i + 1));
                return seatArray[i] = true;
            }
        }
            if (i > firstClassLimit)
                System.out.println("Oga, First class is full!!!");
            return false;
    }
    public boolean pickEconomySeat(int planeSection){
        int i;
        for ( i = 5; i <seatArray.length ; i++) {
            if (!seatArray[i]) {
                System.out.println("Your seat number is " + (i + 1));
                return seatArray[i] = true;
            }
        }
            if (i == getSeatCapacity())
                System.out.println("Oga, Economy Class is full!!!");
                return false;
        }


    }



