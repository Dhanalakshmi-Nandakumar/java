import java.util.*;
public class LinkedHashSets {
    public static void main(String[] args) {
         LinkedHashSet lhs=new LinkedHashSet();
                  LinkedHashSet lhs1=new LinkedHashSet();
lhs1.add(234);
         lhs1.add("Abc");
         lhs1.add('X');
         lhs.add(23);
         lhs.add("Abc");
         lhs.add('X');
         lhs.remove("Abc");
         lhs.addAll(lhs1);
         System.out.println(lhs.retainAll(lhs1));
         System.out.println(lhs); 
                  System.out.println(lhs1); 

    }
}