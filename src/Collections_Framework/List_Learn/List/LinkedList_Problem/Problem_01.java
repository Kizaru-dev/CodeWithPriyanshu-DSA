package Collections_Framework.List_Learn.List.LinkedList_Problem;

import java.util.Collections;
import java.util.LinkedList;

public class Problem_01 {
    public static void main(String[] args) {

        // Q1. Create  linked list

        LinkedList<String> list = new LinkedList<>();
        list.add("Mumbai");
        list.add("Delhi");
        list.add("Hyherbad");
        list.add("Pune");
        list.add("navi Mumbai");
        System.out.println(list);

        // Q2 . add nagpur at the beginning of the list .
        list.addFirst("Nagpur");
        System.out.println(list);

        // Q3. Add Last Element
        list.addLast("Kolkata");
        System.out.println(list);

        // Q4. Get First Element .
        System.out.println("Getting the First element : "+list.getFirst());
        // Q5. Get Last Element
        System.out.println("Getting the Last element "+list.getLast());

        //Q6 Remove the First Element
        System.out.println("Removing the First Element :  " + list.removeFirst());

        // Q7 Remove the Last Element
        System.out.println("Removing the Last Element : " + list.removeLast());

        System.out.println("The Remaining Element is : " + list);

        // Q8 Print All Element Using For-Each Loop

        for(String num : list){
            System.out.println(num);
        }

        // Q9 Search a City .
        System.out.println(list.contains("Mumbai"));

        //10 . Count Element .
        System.out.println(list.size());

        // 11. Reverse The Linkedlist .
        Collections.reverse(list);
        System.out.println(list);

        LinkedList<String> store = new LinkedList<>();
        store.add("A");
        store.add("B");
        store.add("C");
        store.add("D");
        store.add("E");
        store.add(2,"Java");
        System.out.println(store);


    }
}
