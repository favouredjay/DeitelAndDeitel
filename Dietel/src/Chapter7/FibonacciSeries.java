package Chapter7;

public class FibonacciSeries {

    public void calculateTheNthTerm(int n) {
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
        array[i] = array[i-1] + array[i-2];
            System.out.println(array[i]);
        }

    }
    public static void main(String[] args) {
        FibonacciSeries numbers = new FibonacciSeries();

       numbers.calculateTheNthTerm(10);
    }
}
