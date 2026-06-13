package Collections_Framework.List_Learn;

import java.util.Stack;

public class Stack_Learn {
    public static void main(String[] args) {

        // Stack implementation and provider.

        Stack<Integer> stack = new Stack<>();
        stack.add(101);
        stack.add(102);
        stack.add(103);
        stack.add(104);
        stack.add(105);
        stack.add(106);
        stack.push(204); // add the element at the end of the stack .
        System.out.println(stack);
        stack.pop(); // remove the last element of the end of the stack .
        System.out.println(stack);
        stack.peek(); // display the last element of the stack.
        System.out.println(stack.peek());
        System.out.println(stack);
        // search()
        System.out.println(stack.search(101));
    }
}
