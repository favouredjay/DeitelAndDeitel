package Chapter17;

import java.util.stream.IntStream;


public class TryMethods {

    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        IntStream.of(numbers).forEach(value-> System.out.print(value + " "));
        System.out.print("\ncount : " + IntStream.of(numbers).count());
        System.out.println("\nmax :" + IntStream.of(numbers).max().getAsInt());
        System.out.println(IntStream.of(numbers).min().getAsInt());
        System.out.println(IntStream.of(numbers).sum());
        System.out.println(IntStream.of(numbers).average().getAsDouble());
        System.out.println(IntStream.of(numbers).reduce(0, (x,y) ->x+y));
        System.out.println(IntStream.of(numbers).reduce(0,(x,y)->x+y*y));
        System.out.println(IntStream.of(numbers).reduce(0,(x,y)->x*y));
        System.out.println(IntStream.of(numbers).average());

        IntStream.of(numbers)
                .filter(value -> value%2== 0)
                .sorted()
                .forEach(value -> System.out.println(value));

        IntStream.of(numbers)
                .filter(value -> value%2!=0)
                .map(value->value*10 )
                .sorted()
                .forEach(value -> System.out.println(value));

        System.out.println(IntStream.range(1,10).sum());

        System.out.println(IntStream.rangeClosed(1,10).sum());
        System.out.println(IntStream.of(numbers).summaryStatistics());


    }

    }

