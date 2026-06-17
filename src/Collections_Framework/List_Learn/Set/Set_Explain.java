package Collections_Framework.List_Learn.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set Interface extends Collections Interface <br>
 * Set DataStructure is a Structure which Implement's Unique value
 * which mean set can only store unique value not duplicate values .
 * the class which are implementing Set Interface are <br>
 * 1. EnumSet <br>
 * 2. HashSet <br>
 * 3. LinkedHashSet <br>
 * 4. TreeSet <br>
 * <br><br><br>
 * @implNote Some Common Methods in Set Interface / Data Structure <br>
 * 1. add() - adds the specific element to the set <br>
 * 2. addAll() - adds all the elements of the specifield collections to the set . <br>
 * 3. iterator() - returns an iterator that can be used to access elements of the set sequentially <br>
 * 4. remove() - removes the specified element from the set<br>
 * 5. removeAll() - removes all the elements from the set that is present in another
 * specified set .<br>
 * 6. retainAll() - retains all the element in the set that are also present in another
 * specified set .<br>
 * 7. clear() - removes all the element from the set .<br>
 * 8. size() - returns the length (number of elements ) of the set .<br>
 * 9. toArray() - returns an array containing all the elements of the set .<br>
 * 10 . contains() - return true if the set contain the specified element . <br>
 * 11 . containsAll() - return true if the set contains all the elements of the specified collection .<br>
 * 12. hashCode() - returns a hash code value (address of the element in the set ) .
 * <br><br>
 * <b>Internal Working of HashSet</b><br>
 * when we insert an element in hashset . first it <br>
 * generate a hashcode of that element and then store that in hash table<br>
 * which is array-like datastructure and it pointed towards the element . <br>
 *
 */
public class Set_Explain {
    public static void main(String[] args) {

        Set<Integer> hash = new HashSet<>();

        // add()
        hash.add(101);
        hash.add(101);
        hash.add(101);
        hash.add(101);
        hash.add(101);
        hash.add(101);
        hash.add(101);
        // I  have adding 10 times 101 but the value would  enter once only .
        hash.add(102);
        hash.add(105);
        System.out.println(hash);

        // add all adding the element of the one to th another .
        Set<Integer> set = new HashSet<>();
        set.addAll(hash);
        System.out.println(set);

        // iterator() // print the element from iterator()
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // remove()
        set.remove(101);
        System.out.println(set);

        // removeAll()
        set.add(112);
        set.add(113);
        set.add(114);
        set.add(115);
        set.removeAll(hash);
        System.out.println(set);


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);


        System.out.println(set2.containsAll(set1));

    }
}
