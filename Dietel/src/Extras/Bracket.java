package Extras;

public class Bracket {
    public static boolean isValid(String expected){
        if(expected == null){
            throw  new NullPointerException(); }
        if(expected.trim().equals(""))
            return false;
        if(expected.charAt(0) == ')')
            return false;
        if(expected.length()%2 == 1)
            return false;

        int rightCounter = 0;
        int leftCounter = 0;

        for (int index = 0; index < expected.length(); index++) {
            if (expected.charAt(index) == '(') {
                rightCounter++;
                leftCounter--;


            } else {
                rightCounter--;
                leftCounter++;
            }
            System.out.println(expected);
        }

        return (leftCounter == 0 && rightCounter == 0);
    }

    public static void main(String[] args) {
        System.out.println(isValid("((((()))))"));
    }


    }

