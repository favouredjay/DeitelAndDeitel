package chapterFour;

public class ArrayClasswork {


    public static int getAdd(int[] array) {
        int total = array[0] + array[1] + array[2];
        return total;
    }

    public static int getAverage(int[] array) {
        return getAdd(array)/array.length;
    }

    public static int getMax(int[] array) {
        int maximumNum = array[0];
        for (int i = 0; i < array.length; i++)
         if (array[i] > maximumNum){
             maximumNum = array[i];
         }
        return maximumNum;
    }

    public static int getMin(int[] array) {
        int minimumNum = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] < minimumNum) {
                minimumNum = array[i];
            }
        return minimumNum;
    }


    public static int getMinimumSum(int[] array) {
       return getAdd(array) - getMax(array);

    }

    public static int getMaximumSum(int[] array) {
        return getAdd(array) - getMin(array);
    }

    public static void doubleScore(int[] scores){
        for(int i = 0; i < scores.length; i++){
            System.out.println("doubling" + scores[i]);
            scores[i] = scores[i]*2;
        }
        System.out.println("All scores doubled");
    }

}