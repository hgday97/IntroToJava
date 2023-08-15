package Intermediate;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Italy");
        queue.add("America");
        queue.add("Germany");  // This adds them, and sorts the queue alphabetically

        System.out.println("original queue: " + queue);

        queue.remove();
        System.out.print("queue after removing the head element: " + queue + "\n");

        String head = queue.peek();  // Retrieves head of queue, but does not remove it from the queue
        System.out.println("Head of queue: " + head);

        head = queue.poll();  // Retrieves head of queue, AND removes it from the queue
        System.out.println("Removed head: " + head); 

        System.out.println("Queue now looks like: " + queue);
    }
}
