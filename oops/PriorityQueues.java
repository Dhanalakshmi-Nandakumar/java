import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         pq.add(10);
         pq.add(24);
         pq.add(56);
         pq.add(60);
         pq.add(6);
         System.out.println(pq);
          //remove element
          pq.poll();
          pq.remove();
                  System.out.println(pq);

    }
}