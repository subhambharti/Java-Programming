
// 50.	Create a program to implement a PriorityQueue

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap

        // Adding elements
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        // Display and process elements in priority order
        System.out.println("Priority Queue elements (processed in order):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");  // Removes and prints smallest element
        }
    }
}
