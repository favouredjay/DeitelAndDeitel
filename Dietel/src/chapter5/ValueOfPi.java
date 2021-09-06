package chapter5;

public class ValueOfPi {
    public double piValue() {
        double pi = 0;
        for (int i = 1; i <= 200_000; i++) {
            if (i == 1) {
                pi = 4;
            } else if (i % 2 == 0) {
                pi = pi - (double) 4 / (i + (i - 1));
            } else {
                pi = pi + (double) 4 / (i + (i - 1));
            }
            System.out.println(i + " - " + pi);
        }

        return pi;
    }

    public static void main(String[] args) {
        ValueOfPi piValue = new ValueOfPi();
        piValue.piValue();
    }
}