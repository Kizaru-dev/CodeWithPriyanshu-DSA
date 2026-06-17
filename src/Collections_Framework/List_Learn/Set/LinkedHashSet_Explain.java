package Collections_Framework.List_Learn.Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet implements the Set interface the different
 * between linkedHastSet and HashSet is that when we add
 * or insert any element within the hashset we can see that
 * it in unordered list and as well as in LinkedHashset it in
 * ordered so that the different between hashSet and linked
 * hash Set .
 *
 */
public class LinkedHashSet_Explain {
    public static void main(String[] args) {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(101);
        linkedHashSet.add(102);
        linkedHashSet.add(103);
        linkedHashSet.add(104);
        linkedHashSet.add(105);
        linkedHashSet.add(106);


        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1,"babbar");
        Student s2 = new Student(1,"babbar");
        Student s3 = new Student(1,  "babbar");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
