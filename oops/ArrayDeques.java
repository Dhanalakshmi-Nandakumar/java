import java.util.*;
public class ArrayDeques {
    public static void main(String[] args) {
         ArrayDeque<Integer> ad=new ArrayDeque<>(); 
         ad.offer(10);
         ad.offer(20);
         ad.offer(30);
         ad.poll();
         System.out.println(ad);
          ArrayDeque<Integer> ad1=new ArrayDeque<>(); 
         ad1.push(10);
         ad1.push(20);
         ad1.push(30);
         ad1.pop();
         System.out.println(ad1);
    }
}