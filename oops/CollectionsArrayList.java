import java.util.*;
public class CollectionsArrayList {
    public static void main(String[] args) {
        //generic type
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(10);
        ar.add(10);
        ar.add(10);
        ar.add(0,50);
System.out.println(ar);
//object type is not mentioned here
ArrayList al=new ArrayList();
al.addAll(ar);
System.out.println(al);
al.add("string");
al.add('d');
System.out.println(al);
al.remove(6);
System.out.println(al);
al.removeAll(ar);
System.out.println(al);
al.set(0,"dhana");
System.out.println(al);
al.add("dhanalakshmi");
System.out.println(al);
System.out.println(al.contains("d"));
System.out.println(al.indexOf("dhana"));
System.out.println(al.get(1));
    }
}