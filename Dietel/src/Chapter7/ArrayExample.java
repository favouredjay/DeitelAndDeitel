package Chapter7;

public class ArrayExample {

    public int minimum() {
        int list[][] = {{1, 2, 0}, {4, 5, 10}, {7, 8, 9}};
        int maxValue = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++)
                if (list[i][j] < maxValue)
                    maxValue = list[i][j];



        }
        return maxValue;

    }
    public static void main(String[] args) {
//


//    int swap;

//    int [] arrays = new int[10];
//    for ( int i = 0; i<arrays.length; i ++) {
//        arrays[i] = 2 * 2 * i;
//
//    }
//
//    for(int j: arrays)
//        System.out.println(j );
//        int[] arrays = {0,2,1,30,5,0,0,4,0,0,1};
//        for (int i = 0; i < arrays.length; i++) {
//            if (i == 10) {
//                System.out.print("  100:");
//            } else {
//                System.out.print(i * 10 + "-" + i + 9+":");
//            }
//
//
//            for (int stars = 0; stars < arrays[i]; stars++) {
//                System.out.print("*");
//            }
//            System.out.println();
ArrayExample example = new ArrayExample();
        System.out.println(example.minimum());

        }
    }




