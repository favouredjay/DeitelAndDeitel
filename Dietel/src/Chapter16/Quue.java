package Chapter16;

import java.util.PriorityQueue;

public class Quue {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        queue.add(2.5);
        queue.offer(6.3);

        System.out.println(queue.poll());
        System.out.println();
        System.out.println(queue);
    }
}
