package Collections_Framework.List_Learn.Set;


import com.sun.source.tree.Tree;

import java.util.TreeSet;

/**
 * The Important different between this three class are that <br>
 * 1. HashSet - Insertion (unordered like) <br>
 * 2. LinkedHashSet - Insertion (ordered like) <br>
 * 3. TreeSet - Insertion (sorted like ) <br>
 */
public class TreeSet_Explain {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        // inseartion
        treeSet.add(103);
        treeSet.add(101);
        treeSet.add(2222);
        treeSet.add(100);
        System.out.println(treeSet);
    }
}
