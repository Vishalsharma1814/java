package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
