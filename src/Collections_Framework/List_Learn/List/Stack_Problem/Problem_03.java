package Collections_Framework.List_Learn.List.Stack_Problem;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Problem_03 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Q1 . Push Element . (add element)
        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        stack.push(105);
        System.out.println(stack);

        // Q2 . Pop element (remove element )
        System.out.println(stack.pop());

        // Q3. Peak Element (Print the top element without remvoing them ) .
        System.out.println(stack.peek());
        System.out.println(stack);

        // Q4 . Check Empty stack .
        System.out.println(stack.isEmpty());

        // Q5 . Push 1 to 5 .
        Stack<Integer> nums = new Stack<>();
        for(int i = 1 ; i <= 5 ; i++){
            nums.push(i);
        }
        System.out.println(nums);

        // Q6. Print Stack Elements . (using loops)
        Iterator<Integer> stack1 =  nums.iterator();
        while(stack1.hasNext()){
            System.out.println(stack1.next());
        }

        // Q7. Reverse the String "java"
        Stack<String> reverse = new Stack<>();
        reverse.push("j");
        reverse.push("a");
        reverse.push("v");
        reverse.push("a");
        System.out.println(reverse);

        Collections.reverse(reverse);
        System.out.println(reverse);

        // Q8 . Count Element in Stack
        System.out.println(nums.size());

        // Q9 . Search Element .
        System.out.println(nums.contains(30));

        // Q10 Remove all the elements .
        while(!nums.isEmpty()){
            nums.pop();
        }
        System.out.println(nums);
    }
}
