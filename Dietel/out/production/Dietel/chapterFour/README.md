package chapterFour;

public class Chapter6 {


    public double getCircleArea(double radius){
        return (Math.PI * Math.pow(radius , 2));

    }

    public double pythagoras(double opposite, double adjacent){
      double hypotenuse = Math.sqrt(Math.pow (opposite , 2) + Math.pow (adjacent , 2));
      return hypotenuse;
    }


    public int getPowerOfInteger(int base, int exponent) {
        int powerOfInteger = 1;

        for (int counter = 0; counter< exponent ; counter++ ){
            if (exponent > 0);
            powerOfInteger = base * powerOfInteger;
        }
        return powerOfInteger;
    }

    public Boolean isMultipleOf(int numerator, int denominator) {
        for (int counter = 0; counter < numerator; counter++) ;
        if (numerator % denominator == 0) {

            return true;
        } else {
            return false;
        }
    }

    public boolean getEvenNumbers(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else return false;
    }

    }
