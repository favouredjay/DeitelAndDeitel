package Chapter18;

public class GreatestCommonDivisorWithRecursion {
    public static int gcd(int firstNumber, int secondNumber){
        if(secondNumber < 1){
            return firstNumber;
        }else {
            return gcd(firstNumber, secondNumber % firstNumber);
        }

    }

    public static void main(String[] args) {
        System.out.print(gcd(10,50));
    }

}
