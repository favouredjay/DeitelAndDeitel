package Chapter7;
import java.security.SecureRandom;

public class Kata {
    int swap;
    int temp;
int [] arrays = {1,2,3,4,5,6,7,8 ,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};

    public void shuffleArray(int[] arrays) {
        SecureRandom randomNumber = new SecureRandom();
        for (int i = 0; i < arrays.length; i++){
            int number = randomNumber.nextInt(28);
            swap = arrays[number];
            arrays[number] = arrays[i];
            arrays[i] = swap;

        }
    }
    public int[] descendingArray(int [] arrays){
        int number = 0;
        for (int i = 0; i <arrays.length;i++){
//
            for(number = i+1; number <arrays.length; number++)
                if(arrays[i] < arrays[number]) {
                    temp = arrays[i];
           arrays[i]  = arrays[number];
                arrays[number] = temp;

            }

        }

        return arrays;
    }
    public void ascendingArray(){
        int number = 0;
        for (int i = 0; i <arrays.length;i++) {

            for (number = i + 1; number < arrays.length; number++)
                if (arrays[i] > arrays[number]) {
                    temp = arrays[i];
                    arrays[i] = arrays[number];
                    arrays[number] = temp;


                }
        }
        }

public static void main(String[] args) {
    Kata kata = new Kata();
    kata.shuffleArray(kata.arrays);
    for (int i : kata.arrays) {
        System.out.println(i + "" + i);
    }
}

}