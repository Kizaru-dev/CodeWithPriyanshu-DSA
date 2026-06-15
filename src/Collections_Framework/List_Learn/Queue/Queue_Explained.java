package Collections_Framework.List_Learn.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The Queue Interface of the Java collections framework provides the functionality of the queue
 * data structure . It extends the collection framework
 * <br>
 * @implNote {@code This methods are provided by the queue interfaces} <br> <br>
 * 1. add() - insert the specified element into the queue. If the task is successful , add()
 * return true , if not it throws an exception .<br>
 * 2. offer() - Inserts the specified element into the queue. If the task is successful , offer()
 * return true , if not return false . <br>
 * 3. element() - Returns the head of the queue. Throws an exception if the queue is empty <br>
 * 4. peek() - Returns the head of the queue. Returns null if the queue is empty <br>
 * 5. remove() - Returns and removes the head of the queue . Throws an exception if the queue is empty .<br>
 * 6. poll() - Returns and removes the head of the queue . Returns null if the queue is empty .<br>
 * <b>So we use offer() for insert , peek() for see and poll() to remove</b>
 */

public class Queue_Explained {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);

        // offer() - offer me agar task complete hota hai to true return karta hai yeh exception throw karta hai .
        queue.offer(40);
        System.out.println(queue.offer(50)); // print true .
        System.out.println(queue);

        // element() - return karta hai head of the queue or throw karta hai exception agar
        // queue empty hotho .
        System.out.println(queue.element());

        // peek()
        System.out.println(queue.peek()); // return karta hai head element ko aur agar empty queue hai tho null return karta hai .

        System.out.println(queue.remove());
        // remove karta hai head element ko aur agar queue empty hai to exception throw
        // kartha hai .

        System.out.println(queue.poll());
        // same as remove bas empty queue hoto null return karte  hai exception nhi .
        // aur true return karta hai .



    }
}
