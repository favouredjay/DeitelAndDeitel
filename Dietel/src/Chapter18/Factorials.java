package Chapter18;

public class Factorials {
    public  static long factorial(long number){
        long result = 1;
        for (long i = number; i >= 1;i--){
            result *= i;
        }
        return  result;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println(factorial(i));
        }
    }
}
