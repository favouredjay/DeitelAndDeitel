package Kata;

public class SortSorted {
    static int temp;
    int array [] = {1,2,4,6};
    int []array2  = {1, 2, 3};

    public static void sortSortedArray(int [] array, int [] array2){
        int number = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array2.length; j++)
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[number];
                        temp = array[i];
//                    arrays[number] = temp;

                }
        }
    }

    public static void main(String[] args) {

        SortSorted number =new SortSorted();
        SortSorted.sortSortedArray(number.array, number.array2);
        for (int i : number.array){
            for(int j: number.array2)
                System.out.print(i + " " + j );

        }

    }
}
