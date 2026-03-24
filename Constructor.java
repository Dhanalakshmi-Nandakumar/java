class A
{
    A()
    {
        
        System.out.println("A constructor");
    }
    A(int a)
    { 
        this();
                System.out.println("A Para constructor");

    }
}
class B extends A
{
     B()
    {
       // super();
       
        System.out.println("B constructor");
    }
    B(int b)
    {
        super(b);
        //this();
                System.out.println("B Para constructor");

    }
}
public class Constructor {
    public static void main(String[] args) {
       B obj=new B(2);
    }
}