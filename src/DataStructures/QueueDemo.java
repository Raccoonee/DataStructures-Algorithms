package DataStructures;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue FIFO data structure. First-in first-out (ex. line of people)
        // a collection designed for holding elements prior to processing.
        // Linear data structure.
        // offer() = enqueue (add) - adding an object to the tail/end of the queue
        // poll() = dequeue (remove) - removing an object from the head/beginning of the queue

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Daniel");


        System.out.println("contains method: " + queue.contains("Steve"));

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();


        System.out.println(queue.element());

        System.out.println(queue);

        // Why are they useful?
        // 1. Keyboard buffer (letters should appear in the order typed)
        // 2. Printer Queue (Print Jobs should be completed in order)
        // 3. Used in DataStructures.LinkedLists, PriorityQueues, Breadth-first search

    }
}
