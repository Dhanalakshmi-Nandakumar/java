import java.util.*;
public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        //adding element at end
        ll.add(10);
        ll.add(20);

        //adding element at first
 
        ll.addFirst(5);

        //adding element at end

        ll.addLast(100);
        ll.add(200);

        //removing 1st element
        ll.remove(0);

                ll.addFirst(5);
        ll.removeFirst();
        System.out.println(ll.indexOf(100));
        System.out.println(ll.contains(5));

        System.out.println(ll); 

        LinkedList listt=new LinkedList();
        listt.addAll(ll);
                System.out.println(listt); 
                ll.add(90);
                                System.out.println(ll); 

                listt.retainAll(ll);
                System.out.println(listt);
                listt.removeAll(ll);
                                System.out.println(listt);
                                                                System.out.println(ll); 




    }
}