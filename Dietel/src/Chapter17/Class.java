package Chapter17;

import java.util.stream.IntStream;

public class Class {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .map((value)->{return value * 2;})
                .sum());
    }
}

