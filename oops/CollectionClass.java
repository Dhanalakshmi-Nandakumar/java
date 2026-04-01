import java.util.*;
public class CollectionClass {
    public static void main(String[] args) {
     List<String> li=Arrays.asList("Apple","Mango","Grapes","Banana","Apple","Apple");
     Collections.sort(li);
     System.out.println("after sorting "+ li);
          Collections.reverse(li);
     System.out.println("after reverse "+li);
     Collections.shuffle(li);
     System.out.println("after shuffle "+li);
     Collections.swap(li,0,3);
     System.out.println("after swapping "+ li);
          System.out.println("min: "+ Collections.min(li));
          System.out.println("max: "+ Collections.max(li));
        System.out.println("frequency of apple : "+ Collections.frequency(li,"Apple"));
        Collections.replaceAll(li,"Apple","Gova");
          System.out.println("replace apple to gova: "+li);
        Collections.fill(li,"fruits");
          System.out.println("replace all to fruits: "+li);



    }
}