package Chapter6;
public class GreatestCommonDivisor {
    public int gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

        }return gcd;
    }
    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        System.out.println( greatestCommonDivisor.gcd(909, 657));
    }
    }

