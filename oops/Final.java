class A
{
     final public void show()
    {
                System.out.println("im final method A");

    }
}
class B extends A
{
 public void show()
    {
                System.out.println("im final method B");

    }
}
public class Final{
    public static void main(String args[])
    {
        final String name="Dhana";
       // name="dd";
        System.out.println(name);
        A o=new A();
        o.show();
        B ob=new B();
        ob.show();
    }
}