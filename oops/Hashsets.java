import java.util.*;
public class Hashsets {
    public static void main(String[] args) {
          HashSet<Integer> h=new HashSet<>();
          h.add(12);
          h.add(13);
          h.add(13);
          h.add(130);
                    h.add(120);
                    h.add(16);

        System.out.println(h.contains(12));
        //remove element
        System.out.println(h.remove(13));
        //System.out.println(h);
       Iterator<Integer> it =h.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }
    }
}