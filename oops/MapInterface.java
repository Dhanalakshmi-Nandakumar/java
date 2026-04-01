import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
         Map<Integer,String> fruits=new HashMap<>();
         fruits.put(10,"banana");
                  fruits.put(10,"banana");

         fruits.put(10,"apple");

         fruits.put(30,"gauva");
         fruits.put(40,null);
         //fruits.remove(10);
         System.out.println(fruits.containsKey(10));
         System.out.println(fruits.get(40));
         Map<Integer,String> map=new HashMap<>();
         System.out.println(fruits);
         map.putAll(fruits);
         System.out.println(map);
                  System.out.println(fruits.containsValue("gauva"));
                  fruits.putIfAbsent(40,"cherry");
                                    fruits.putIfAbsent(10,"cherry");
                                    fruits.put(50,"cherry");

         System.out.println(fruits);

         //changing map to set 
         //note here diff key same value is allowed and set also treat this as unique value in map
         System.out.println(fruits.entrySet());

         //get only values
         System.out.println(fruits.values());

         //get only key
System.out.println(fruits.keySet());
for(Map.Entry<Integer,String> e:fruits.entrySet())

           System.out.println(e.getKey()+" "+e.getValue());
    }
}