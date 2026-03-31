import java.util.*;
public class Cursor {
    public static void main(String[] args) {
          ArrayList<Integer> al=new ArrayList<>();
          al.add(20);
          al.add(30);
          al.add(40);
          al.add(50);
          al.add(60);
          Iterator<Integer> i=al.iterator();
          while(i.hasNext())
          {
            //move the cursor at begin()           
            //System.out.println(i.next());

            // Integer ob=i.next();
            // if(ob==20)
            //     i.remove();
            i.next();
          }

    
          ListIterator<Integer> li=al.listIterator();

        //forward
        //   while(li.hasNext())
        //   {
        //     li.next();
        //   }


        //backward
        //   while(li.hasPrevious())
        //   {
        //     System.out.println(li.previous());
        //     Integer it=li.previous();
        //     if(it==40)
        //       li.remove();
        //   }
        //   System.out.println(al);
        
    }
}