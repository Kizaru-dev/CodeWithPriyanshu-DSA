package Collections_Framework.List_Learn.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Explain {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(101);
        stack.push(102);
       stack.push(103);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
