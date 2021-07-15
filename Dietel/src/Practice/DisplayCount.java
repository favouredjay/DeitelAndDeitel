package Practice;

public class DisplayCount {

    public int[] displayArrayCount(int [] array){
        int[]  count =new int[100];
        for (int counter=0;counter<array.length;counter++){
            count[array[counter]-0]++;
            for(int i=0;i<count.length;i++){

                if(i%10==0){
                    System.out.println();
                }
                System.out.print(i+" "+count[i]);
            }
        }
    return null;
    }

    public static void main(String[] args) {
        DisplayCount displayCount=new DisplayCount();
        int [] array={23,34,56,78,1,2,1,1,3,4,5};
        System.out.println(displayCount.displayArrayCount(array));
    }
}
