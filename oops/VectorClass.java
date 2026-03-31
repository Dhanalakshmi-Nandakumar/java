import java.util.*;
public class VectorClass {
    public static void main(String[] args) {
         Vector<Integer> v=new Vector<>();
         v.addElement(1);
         v.add(3);
         v.remove(0);
         v.clear();
         v.add(4);
         System.out.println(v.contains(1));
         System.out.println(v.indexOf(4));
         System.out.println(v);
         Vector v1=new Vector();
         v1.add("abc");
         v1.add("def");
         v1.add("ghi");
         v1.add(89);
         v1.add(true);
         v1.add('A');
         System.out.println(v1);
         v.addAll(1,v1);
          System.out.println(v);
          //v.removeAll(v1);
          System.out.println(v);
         System.out.println(v1);
         v.retainAll(v1);
         System.out.println(v);
                  System.out.println(v.get(0));
//printing values from vector
for( Object prints:v)
          System.out.println(prints);
    }

    
}