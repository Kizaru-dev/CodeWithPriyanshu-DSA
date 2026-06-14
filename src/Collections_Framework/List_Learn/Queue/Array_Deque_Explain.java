package Collections_Framework.List_Learn.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ArrayDeque is same is stack which follows FIFO method
 * first in and first out , the arrayDeque implement Deque
 * interface which extends to Queue and Queue extends to
 * Collection Interface .
 * @implNote <br>
 * Why not use Stack instead of ArrayDeque the reason behind that is
 * stack extends to vector class and vector methods are synchronized
 * Extra Locking = slow performance <br>
 * Most of the application does want this locking .
 * <br>
 * {@code ArrayDeque} benefits : <br>
 * 1. Faster <br>
 * 2. Modern <br>
 * 3. Less Memory allocation <br>
 * 4. Recommended by Java document<br><br>
 * <b>The Different Types of methods are as follows . </b><br>
 * 1. offer() - insert the element  <br>
 * 3. push() -  insert the element  <br>
 * 4. peek() - view top element From the start of the queue   <br>
 * 5. size() - Total element  <br>
 * 6. isEmpty() - check if the arraydeque is empty or not . <br>
 * 7. push() - add element at the start of the queue .
 * 8. pop() - remove the element for the start.
 * 9.
 *
 */

public class Array_Deque_Explain {
    /**
     * Why we can this double - ended queue . <br>
     * Because it support operation from both ends .<br><br>
     * {@code Front Side}<br>
     * 1. addFirst() - add at the front of the deque.<br>
     * 2. removeFirst() - remove the element from the front .<br>
     * 3. peekFirst() - see the element from the front .<br>
     *
     * {@code Rear Side}<br>
     * 1. addLast() - add the element at last . <br>
     * 2. removeLast() - remove the element from last . <br>
     * 3. peekLast() - see the element from the last . <br>
     * @param args
     */
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(101);
        arrayDeque.offer(102);
        arrayDeque.offer(103);
        arrayDeque.offer(104);
        System.out.println(arrayDeque);

        Deque<Integer> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.add(1001);
        arrayDeque1.add(1002);
        arrayDeque1.add(1003);
        arrayDeque1.add(1004);
        arrayDeque1.add(1005);
        // push
        arrayDeque1.push(1006); //
        System.out.println(arrayDeque1);

        // pop
        System.out.println(arrayDeque1.pop());
        System.out.println(arrayDeque1);

        // peek
        System.out.println(arrayDeque1.peek());
        System.out.println(arrayDeque1);

        // addFirst
        arrayDeque1.addFirst(1000);
        System.out.println(arrayDeque1);
        // peekFirst
        System.out.println(arrayDeque1.peekFirst());
        // removeFist
        System.out.println(arrayDeque1.removeFirst());
        System.out.println(arrayDeque1);
    }
}
