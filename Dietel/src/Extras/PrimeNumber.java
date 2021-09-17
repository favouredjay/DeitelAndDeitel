package Extras;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp = 0;
        int i;
        for (i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }


    }
}