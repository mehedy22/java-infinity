package collection_framework.priority_queue;

import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);
        maxPQ.add(4);

        // Lets print the elements of the queue
        maxPQ.forEach(System.out::println);

        // Let's remove top element from the PQ and print
        while (!maxPQ.isEmpty()) {
            int value = maxPQ.poll();
            System.out.println(value);
        }
        '
    }
}
