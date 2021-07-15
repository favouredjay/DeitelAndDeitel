public class AirlineReservation {
    private final boolean[] seatNumber = new boolean[11];
    private String classType;
    private int fClassCounter = 0;
    private int seatCounterA = 0;
    private int seatCounterB = 6;
    private boolean availableSeat;
    private int fClassSeatLimit = 5;
    private int economySeatLimit = 10;
    private int loopCounter = 1;

    public void initializeArray() {
        for (int i = 1; i < seatNumber.length; i++) {
            seatNumber[i] = false;
        }

    }

    public boolean getSeatNumber(int num) {
        for (int i = num; i < seatNumber.length; i++) {
            seatNumber[i] = false;

        }
        return seatNumber[num];
    }

    public void checkAvailableClass(String classType) {
        if (classType.equals("First Class"))
            this.classType = classType;
        if (classType.equals("Business"))
            this.classType = classType;
    }

    //    public void canBookFirstClass() {
//        if()
//    }
    public String getAvailableClassTypes() {
        return classType;
    }

    public boolean canCreateSeatArrangementForFirstClass(int seatNumbers) {
        if (!seatNumber[fClassCounter] && fClassCounter <= 5) {
            seatNumber[fClassCounter] = true;
            fClassCounter++;
            return false;
        } else
            return true;


    }

    public void checkAvailableSeatInFirstClass(int userInput) {
//        while (loopCounter <= 10) {
//        if (userInput == 1 || userInput == 2) {
        if (userInput == 1) {
            if (!seatNumber[seatCounterA] && seatCounterA < 5) {
//                seatNumber[seatCounterA] = true;
                seatCounterA++;
                System.out.println("Seat "+ seatCounterA + " is Available");
                if (seatCounterA == fClassSeatLimit) ;
//                    break;
            }

        }
    }
    public boolean getAvailableSeatInFirstClass(){
        return seatNumber[seatCounterA];
    }
    public void checkAvailableSeatInEconomy(int userInput){
                    if (userInput == 2) {
                        if (seatNumber[seatCounterB] == false && seatCounterB <= 10) {
                            seatNumber[seatCounterB] = true;
                            System.out.println("Seat "+ seatCounterB + " is Available");


                             if (seatCounterB == economySeatLimit){
//                            break;
                        }
                        seatCounterB++;
                    }
                }
                }
    public boolean getAvailableSeatInEconomyClass(){
        return seatNumber[seatCounterB];
    }

//    public void assignSeatToPassenger(boolean ) {
//        for(seatCounterA = 0; s)
//    }
}

        //loopCounter++;
//        }


//                seatNumber[num] > 0 && seatNumber[num] <= 5
//            }
//        }
//        System.out.println("");
//    }
//
//    public void canCreatSeatArrangementForFirstClass(int i, int i1, int i2, int i3, int i4) {
//    }
//

//            if(seatCounterA == limitA && seatCounterB == limitB)
//                break;
//        }
//        else {
//            System.out.println("Firstclass section is full. \nWould you like to be placed in the econnomy class?"
//                    + "\nIf yes press 1. If no press 2");
//
//            if(choice == 1) {
//                continue;
//            }
//            else {
//                System.out.println("Next flight leaves in 3 hours");
//                break;




//    public void creatSeatNumbers(int[] seatNumbers) {
//        this.seatNumber.equals(seatNumber);
//    }
//
//    public boolean getAvailableSeatNumbers() {
//        int seatID = 0;
//        for (boolean numberOfSeat : seatNumber) {
//            return getAvailableSeatNumbers();
//        }
//
//        return false;
//    }

//    public void generateSeatNumber(String classType) {
//
//    }

//        int start = 0, end = 0;
//        if (classType.equals("First Class")) {
//            start = 0;
//            end = 5;
//        }
//        if (classType.equals("Economy")) {
//            start = 5;
//            end = 10;
//        }
//        int freeSeat = -1;
//        for (int i = start; i < end; i++) {
//            if (!this.seatNumber[i]) {
//                freeSeat = i;
//            }
//        }
//        if(classType.equals("First Class")) {
//        this.seatNumber[0] = true;
//        this.seatNumber[1] = true;
//        this.seatNumber[2] = true;
//        this.seatNumber[3] = true;
//        this.seatNumber[4] = true;
//    }
//        if (classType.equals("Economy")) {
//        this.seatNumber[5] = true;
//        this.seatNumber[6] = true;
//        this.seatNumber[7] = true;
//        this.seatNumber[8] = true;
//        this.seatNumber[9] = true;
//    }
//
//        }
//
//
//    public boolean getSeatNumber(int eachSeat) {
//
//        for (int seatsCounter =0 ; seatsCounter<this.seatNumber.length; ){
//            System.out.println(seatsCounter);
//            eachSeat = seatsCounter;
//            seatsCounter++;
//        }
//
//        try{
//            generateSeatNumber("First Class");
//            this.seatNumber.equals(eachSeat);
//        }
//        catch (ArrayIndexOutOfBoundsException ignored){
//            System.out.println(ignored);
//
//        }
//
//        return seatNumber.equals(1<=5);
//    }




//    public void canCreatSeatArrangementForFirstClass(int i) {
//    }
