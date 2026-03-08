package collection_framework.priority_queue;

import java.util.PriorityQueue;

public class MinPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(40);
        minPQ.add(20);
        minPQ.add(50);
        minPQ.add(10);
        minPQ.add(30);

        // Lets print the elements of the queue
        minPQ.forEach(System.out::println);

        // Let's remove top element from the PQ and print
        while (!minPQ.isEmpty()) {
            int value = minPQ.poll();
            System.out.println("Removed: " + value);
        }

    }
}
