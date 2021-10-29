package Extras;

public class Assignment {

    public static int calculateAge(int fathersAge, int sonsAge){
        int result = fathersAge - sonsAge* 2;
        return Math.abs(result);
        }

    public static void main(String[] args) {
        System.out.println(calculateAge(10, 30));
    }
    }

