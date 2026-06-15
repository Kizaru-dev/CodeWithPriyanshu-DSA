package Collections_Framework.List_Learn.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @implNote Default behaviour of the priority queue .
 * kise integer ki value kam hoge uske priority subse jata hoge .
 * for example : 10 ,20 ,30 the priority is 10 .
 * so when we do . p.poll() it will remove the smallest interger .
 */

public class PriorityQueue_Explain {
    public static void main(String[] args) {

        // default behaviour -> Integers -> less value -> high priority -> min Heap
        // maxheap -> integer -> high value - > high priority .
        Queue<Integer> p = new PriorityQueue<>((a,b)-> b-a);
         p.offer(12);
         p.offer(13);
         p.offer(14);
         p.offer(15);
         p.offer(10);
        System.out.println(p);

        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p);

    }
}
