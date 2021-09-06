package Extras;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        int i;
        for( i = 1; i<10; i++){
            for (int j = 2; j <10; j++)
                if(i%j !=0) {
                    temp=i;
                    System.out.println(temp);
                }
        }
    }
}
