package Chapter7;

public class MoveArray {
    public static void main(String[] args) {
        int [] array = {8,9,3,4,5,6};
        int value1 = array[0];
        for (int i =1; i<array.length;i++){
            array[i-1] = array[i];

        }
        array[5] = value1;
        for(int i : array)
        System.out.print(i + ",");
    }
}
