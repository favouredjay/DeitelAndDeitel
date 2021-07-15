package Extras;

import java.util.stream.IntStream;

public class Check {
    public static void main(String[] args) {

       IntStream value = IntStream.rangeClosed(1, 10)
                .map((int x) -> {return x + 2;});
        System.out.println(value);
    }
}
