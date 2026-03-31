import java.util.*;
public class stackClass {
    public static void main(String[] args) {
      Stack s=new Stack();
      s.add(10);
      s.push(20);
      s.push(30);
      System.out.println(s);
      System.out.println(s.peek());
      System.out.println(s.pop());
      System.out.println(s);
      System.out.println(s.search(20));
       
    }
}