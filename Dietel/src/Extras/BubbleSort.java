package Extras;

public class BubbleSort {
    int [] array = {2,3,9,4,2,1};
    public static void main(int [] array) {

        int temp;
        int i;
        for( i = 0; i < array.length; i++){
            if(array[i] > array[i +1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                boolean sorted = false;

            }
        }

    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        BubbleSort.main(sort.array);
        for(int i : sort.array){
            System.out.println(i);
        }

    }
}
