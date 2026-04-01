import java.util.*;
class User implements Comparable<User>{
    int id;
    User(int id)
    {
        this.id=id;
       
    }
    public int compareTo(User that)
    {
         if(this.id > that.id)
              //swap the value
              return 1;
            else 
              return -1;
    }
    public String toString() {
    return "User(" + id + ")";
}
    
}
public class TreeMaps {
    public static void main(String[] args) {
      TreeMap <Integer,String> tm=new TreeMap<>();
      tm.put(12,"sjf");
      tm.put(4,"ygh");
      tm.put(45,"hjj");
      tm.put(2,"ggg");
      System.out.println(tm);
      

      TreeMap <User,String> tm1=new TreeMap<>();
      tm1.put(new User(12),"a");
      tm1.put(new User(1),"v");
      tm1.put(new User(192),"g");
      tm1.put(new User(19),"d");
      System.out.println(tm1);

      
    }
}