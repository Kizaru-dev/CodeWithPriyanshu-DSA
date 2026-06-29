package Collections_Framework.List_Learn.List.ArrayList_Problems;

import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Add element : <br>
 * Create an ArrayList of integers and add number 10 , 20 , 30 , 40 , 50 <br>
 * output :- [10,20,30,40,50)
 *
 */
public class Problem_01 {
    public static void main(String[] args) {
        int n = 5 ;
        addElementInArrayList(n);
    }


    // Q1. Add Element into the ArrayList.
    static void addElementInArrayList(int n ){

        List<Integer> list = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            list.add(i*10);
        }

        // Q2 Print all the element inside the ArrayList.
        System.out.println(list);
        // Q3 Find the size of the element .
        System.out.println(list.size());

        //Q4 Get Element by Index . (print the 3rd element from the arraylist )
        System.out.println(list.get(2));

        //Q5 To change the springboot to java .
        List<String> list2 = new ArrayList<>();
        list2.add("Springboot");
        list2.add("Python");
        list2.add("DotNet");
        list2.add("JavaScript");
        System.out.println(list2);
        list2.set(0,"Java");
        System.out.println(list2);

        // Q6 Remove Element
        list2.remove(3);
        System.out.println(list2);

        //Q7. Search Element .
        System.out.println(list2.contains("Python"));

        //Q8 find the sum of the arraylist .
        System.out.println(list);
        int result = 0  ;
        for(int i = 0 ; i < list.size() ; i++){
            result +=list.get(i);
        }
        System.out.println(result);


        //Q9 Find the Maximum Number .
        ArrayList<Integer> maxNumber = new ArrayList<>();
        maxNumber.add(1);
        maxNumber.add(2);
        maxNumber.add(3);
        maxNumber.add(4);
        maxNumber.add(5);
        maxNumber.add(6);


        System.out.println(maxNumber);

        // 10. Find Even Number .
        //Q11 Print the even numbers from Arraylist .
        for (Integer integer : maxNumber) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        //Q12  Remove the duplicates .
        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(2);
        original.add(3);
        original.add(3);
        original.add(4);
        original.add(4);

        ArrayList<Integer> unique = new ArrayList<>();

        for(Integer num : original){
            if(!unique.contains(num)){
                unique.add(num);
            }
        }

        System.out.println(unique);





    }



}
