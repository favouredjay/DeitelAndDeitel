package Chapter6;
import java.security.SecureRandom;

public class Chapter6 {
    private int perfect = 0;
    private CoinTossingChance coinTossing;
    int headCount;
    int tailCount;

    enum CoinTossingChance{
        HEAD,
        TAIL;
    }


    public double getCircleArea(double radius){
        return (Math.PI * Math.pow(radius , 2));

    }

    public double pythagoras(double opposite, double adjacent){
       return Math.sqrt(Math.pow (opposite , 2) + Math.pow (adjacent , 2));
    }


    public int getPowerOfInteger(int base, int exponent) {
        int powerOfInteger = 1;

        for (int counter = 0; counter< exponent ; counter++ ){
            powerOfInteger = base * powerOfInteger;
        }
        return powerOfInteger;
    }

    public Boolean isMultipleOf(int numerator, int denominator) {
        for (int counter = 0; counter < numerator; counter++) ;
            return numerator % denominator == 0;
        }

    public boolean getEvenNumbers(int num) {
        return num % 2 == 0;
    }

    public double convertToFahrenheit(double celsius) {
        return  9.0 / 5.0 * celsius + 32;

    }


    public double convertToCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++){
            if (number % i == 0)
            return false;
    }
        return true;
    }

    public boolean isPerfectNumber(int number) {
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0){
                perfect = perfect + i;
            }
            }
        return number == perfect;
    }

    public int qualityPoints(int studentAverage) {
        if (studentAverage >= 90 && studentAverage <=100){
            return 4;
        } else if(studentAverage >=80 && studentAverage <= 89){
            return 3;
        }else if(studentAverage >=70&& studentAverage <= 79){
            return 2;
        }else if(studentAverage >= 60 && studentAverage <= 69){
            return 1;
        }else return 0;
    }

    public CoinTossingChance flip(int chance){

        if (chance == 1) {
            coinTossing = CoinTossingChance.HEAD;
        }else if (chance == 2){
            coinTossing = CoinTossingChance.TAIL;
        }
         return coinTossing;
    }

    public void countCoinTossingChance() {
        int chance;
        for (int i = 0; i < 10; i++) {
            SecureRandom random = new SecureRandom();
            chance = random.nextInt(10);
            if (chance == 1) {
                coinTossing = CoinTossingChance.HEAD;
                headCount++;


            } else if (chance == 2) {
                coinTossing = CoinTossingChance.TAIL;
                tailCount++;


            }

        }
    }
    public int getHeadCount(){
        return headCount;
    }
    public int getTailCount(){
        return tailCount;
    }


    public static void main(String[] args) {
    Chapter6 chapter6 = new Chapter6();


        System.out.println(chapter6.getHeadCount());
        System.out.println(chapter6.getTailCount());
    }
}
