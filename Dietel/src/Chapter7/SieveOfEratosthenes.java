package Chapter7;

public class SieveOfEratosthenes {
    boolean[] primeNumbers = new boolean[1000];
    public void setPrimeNumbers() {

        for (int i = 0; i < primeNumbers.length - 1; i++) {
            primeNumbers[i] = true;
        }
        for (int j = 2; j * j <= 1000; j++) {
            if (primeNumbers[j] == true) {
                for (int i = j * j; i <= primeNumbers.length-1; i += j) {
                    primeNumbers[i] = false;
                }

            }
        } for(int i = 2; i<= primeNumbers.length-1;i++){
            if(primeNumbers[i]){
                System.out.println(i + " is " + primeNumbers[i]);
            }
        }
    }




    public static void main(String[] args) {
        SieveOfEratosthenes primeNumbers = new SieveOfEratosthenes();
        primeNumbers.setPrimeNumbers();
//        for (boolean prime : primeNumbers.primeNumbers)
//            System.out.println(prime);
    }

    }



