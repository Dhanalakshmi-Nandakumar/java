import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {

        //comparator
        Comparator<Integer> com=new Comparator<Integer>(){
         
         //overrifing compare method
         public int compare(Integer i,Integer j)
         {
            if(i%10>j%10)
              //swap the value
              return 1;
            else 
              return -1;
         }
        };
       List <Integer> li=new ArrayList<>();
       li.add(99);
       li.add(32);
       li.add(16);
       Collections.sort(li,com);
       System.out.println(li);
    }
}