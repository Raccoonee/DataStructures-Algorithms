package DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure that serve elements
        //                    with the highest priorities first
        //                    before elements with lower priority

        Queue<String> studentGPA = new PriorityQueue<>();

        //Collections.reverseOrder() reverse the order
        // if numbers starts from smallest to biggest
        // if letters starts from A to Z

        studentGPA.offer("B");
        studentGPA.offer("A");
        studentGPA.offer("F");
        studentGPA.offer("C");
        studentGPA.offer("D");

        while (!studentGPA.isEmpty()) {
            System.out.println(studentGPA.poll());
        }


    }
}
