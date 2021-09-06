package Chapter7;

public class FibonacciSeries {

    public int fibonacci(int number){
        if((number ==0 ) || (number == 1))
            return number;
        else
            return fibonacci(number -1 ) + fibonacci(number - 2);
    }
    public void displayFibonacci(int n){
        int [] array = new int[n];
        for (int i = 0; i<=array.length;i++ )
            System.out.println(" Fibonacci of " + i + " is " + fibonacci(i));
    }
    public static void main(String[] args) {
        FibonacciSeries numbers = new FibonacciSeries();

       numbers.displayFibonacci(10);
    }
}
