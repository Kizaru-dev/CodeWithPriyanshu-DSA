package Collections_Framework.List_Learn;

import java.util.*;

public class LinkedList_Learn {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // parents reference and child object - we can use methods of parents.
        LinkedList<Integer> linkedList = new LinkedList<>(); // both the reference and object are of child then we can use parent + child method

        // add (same as arraylist)
        list.add(100); // we can add only one element .
        list.add(101);
        list.add(102);
        System.out.println(list);

        // remove (same as arraylist)
        // help to remove element .
        list.remove(1); // we need to pass index of the element .
        System.out.println(list); // print the remaining element after removing the element from the index of 3.

        // addAll (same as arraylist)
        // we can add another list into to list .
        List<Integer> myList  = new LinkedList<>();
        myList.addAll(list); // adding the element of the list to mylist.
        System.out.println(myList);

        // Size same as arraylist . (return the size of the linkedlist)
        System.out.println(list.size());

        //Remove all Method as AddAll method (return the element same as the another list element )
        myList.removeAll(list);
        System.out.println(myList);

        myList.add(101);
        myList.add(102);
        myList.add(103);
        myList.add(104);
        myList.add(105);

        // work greater with iterator .
        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        myList.get(2); // get the element int he 2 index position.
        myList.set(2,104); // get the element in the index and remove the exists one
        System.out.println(myList);

        // ToArray ( The return type is object[] array and this help to convert collection
        // into array and add the for loop to print the element )
        Object[] myList2 = myList.toArray();
        for(Object  object : myList2){
            System.out.println(object);
        }

        // contains method . (same as arrayList)
        System.out.println(myList.contains(101));; // check if the array contain 101 or not and return the boolean value

        // sort an LinkedList . (same as arrayList)
        Collections.sort(myList,Collections.reverseOrder());
        System.out.println(myList);

        // clone() method is not allowed in linkend List ;
        // ensureCapacity is not allowed in Linkend List ;
        System.out.println(myList.indexOf(101)); // work as a linkend list.

        System.out.println(myList.lastIndexOf(104));



        LinkedList<Integer> lists = new LinkedList<>();
        lists.add(6);
        lists.add(12);
        lists.add(30);

        // add first and add last element .
        lists.addFirst(101); // add at the first of the list s.
        System.out.println(lists); // print
        lists.addLast(40); // add at the last of the lists .
        System.out.println(lists);
        lists.removeFirst(); // remove the first element .
        lists.removeLast();// remove the last element .
        lists.getFirst(); // get first element .
        lists.getLast(); // get last element .
        System.out.println(lists);
        System.out.println(lists.peek()); // return the head of the element of the link list .
        System.out.println(lists.poll()); // return and first element and remove the first element .
        System.out.println(lists);
        System.out.println(lists.offer(23)); // add the element at the last of the list and return true .
        System.out.println(lists);


        // Create Integer type Stack
        Stack<Integer> stack = new Stack<>();
        // Create String types stack.
        Stack<String> stacks = new Stack<>();






    }
}
