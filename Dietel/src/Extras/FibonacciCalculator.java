package Extras;

public class FibonacciCalculator {
    public int fibonacci(int number){
        if((number ==0 ) || (number == 1))
            return number;
        else
            return fibonacci(number -1 ) + fibonacci(number - 2);
    }
    public void displayFibonacci(){
        for (int i = 0; i<=10;i++ )
            System.out.println(" Fibonacci of " + i + " is " + fibonacci(i));
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.displayFibonacci();
    }
}
