package S21_data_structures;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import S05_user_inputs.Terminal;

public class StackQueueDemo {
    public static void main(String[] args) {
        Terminal.clear();

        // Stack - LIFO - Last In First Out
        System.out.println("Stack Demo:");

        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop()); // removes and returns the top element
        System.out.println("Peeked: " + stack.peek()); // returns the top element without removing it
        System.out.println("Stack after pop: " + stack);

        System.out.println("****************");

        // Queue - FIFO - First In First Out
        System.out.println("Queue Demo:");
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Queue: " + queue);
        System.out.println("Polled: " + queue.poll()); // removes and returns the head element
        System.out.println("Peeked: " + queue.peek()); // returns the head element without removing it
        System.out.println("Queue after poll: " + queue);
    }
}
