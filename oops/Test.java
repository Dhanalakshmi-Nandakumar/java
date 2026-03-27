class Laptop
{
     String model;
     int price;
     public String toString()
     {
        
        return model+" "+price;
     }
     
}

public class Test {
    public static void main(String[] args) {
        // Your Code goes here!
          String A="hi";
        String B=new String("hi");
                    System.out.println(A==B);
                    Laptop obj1=new Laptop();
                    obj1.model="mac";
                    obj1.price=50000;
                    System.out.println(obj1);
                     Laptop obj2=new Laptop();
                    obj2.model="mac";
                    obj2.price=50000;
                    System.out.println(obj2);
                                        System.out.println(obj1==obj2);


    }
}