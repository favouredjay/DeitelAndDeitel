package Chapter17;

import java.util.stream.IntStream;

public class Class {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .map((value)->{return value * 2;})
                .sum());
    }
}
//        int total = 0;
//for(int i = 2; i<=20; i+=2){
//    total += i;
//
//} System.out.println(total);

