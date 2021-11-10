package chapterFour;

public class InfiniteLoop {
    public int infinite(){
        int number = 1;
        int counter = 1;
        while(number >0){
            number = number * 2;

            System.out.println(number);
        }
    return number;
    }

    public static void main(String[] args) {
        InfiniteLoop infiniteLoop = new InfiniteLoop();
        infiniteLoop.infinite();
    }
}
