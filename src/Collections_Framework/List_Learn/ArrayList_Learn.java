package Collections_Framework.List_Learn;

import java.sql.Array;
import java.util.*;

public class ArrayList_Learn {
    public static void main(String[] args) {
        // List or Collections . -> Both are interfaces.
//************************************************************//
        // ArrayList -> concrete class hai .
        ArrayList<Integer> arrayList = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

        // Below are the common methods which are implemented from the
        // collection interface to list and to the concrete class
        // arraylist , linked-list , vector ....
        //************************************************************//
        // add element to the arraylist .
        // common method coming from the collection framework .
        // the concrete class arraylist implementing list and list is
        // extend to collection.
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        //************************************************************//
        // Remove Element from the arraylist.
        arrayList.remove(0);
        System.out.println(arrayList);

        //************************************************************//
        // AddAll method
        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(20);
        // addAll method add all the element from the another list element in
        // different list .
        // list -> (list) + arraylist ;
        arrayList.addAll(list);
        System.out.println(arrayList);

        //************************************************************//
        // removeAll method
        arrayList.removeAll(list);
        System.out.println(arrayList);

        // Size of the arraylist
        System.out.println(arrayList.size());

        //************************************************************/
        // clear method delete all the element in the list  /
        System.out.println("Printing list 2 : " + list);
        list.clear();
        System.out.println(list);

        // I want to traverse list using iterator.
        Iterator<Integer> iterator = arrayList.iterator();

         while(iterator.hasNext()){
             System.out.println("Element :  " + iterator.next());
         }

         // Another List reference to the arraylist .
         List<Integer> list3 = new ArrayList<>();
         list3.add(11);
         list3.add(12);
         list3.add(13);
         list3.add(14);
         // get methods is help to fetch element from the list .
        System.out.println(list3.get(3));
        System.out.println("Before set :  "   + list3);
        // set help to set the element in the index in which you want to add.
        // and remove the present element and add the new element in that place .
        list3.set(0,100);
        System.out.println("After set : "   + list3);

        // to Array .
        Object [] arr = list3.toArray();
        for(Object object : arr){
            System.out.println(object);
        }

        // contains method.
        boolean contain = list3.contains(23);
        System.out.println(contain);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println("Printing  Entire List : "  + arrayList1);
        arrayList1.addAll(list3);
        System.out.println("Printing entire list : " + arrayList1);

        // sort() the element in asceding
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        Collections.sort(arrayList1,Collections.reverseOrder());
        System.out.println(arrayList1);
        System.out.println(arrayList1);

        // clone() . // one arraylist getting all the element from the another arrayList
        ArrayList<Integer> newList=(ArrayList<Integer>) arrayList.clone();

        // arrayList .setting the minimum capacity of arraylist for optimization
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty() -> checks if the arraylist is empty (return true or false )
        ArrayList<Integer> list12 = new ArrayList<>();
        System.out.println(list12.isEmpty());

        // indexOf() -> Searches a specified element in an arrayList and returns the index of the
        // element .
        System.out.println(arrayList1.indexOf(13));
    }
}
