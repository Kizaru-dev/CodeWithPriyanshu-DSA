package Collections_Framework.List_Learn.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueue_Explain {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(101);
        queue.offerFirst(102);
        queue.offerLast(103);
        System.out.println(queue);

        queue.pollLast();
        queue.pollFirst();
        System.out.println(queue);

        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.peek());
    }
}
