package chapterFour;
import java.security.SecureRandom;
public class RandomMonth1 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int num = random.nextInt(12);

        if (num ==1)
            System.out.println("Month is January");
        if (num == 2)
            System.out.println("Month is February");
        if (num == 3)
            System.out.println("Month is MARCH");
        if (num ==4)
            System.out.println("Month is April");
        if (num == 5)
            System.out.println("Month is May");
        if (num == 6)
            System.out.println("Month is June");
        if (num ==7)
            System.out.println("Month is July");
        if (num == 8)
            System.out.println("Month is August");
        if (num == 9)
            System.out.println("Month is September");
        if (num ==10)
            System.out.println("Month is October");
        if (num == 11)
            System.out.println("Month is November");
        if (num == 12)
            System.out.println("Month is December");
    }
}
