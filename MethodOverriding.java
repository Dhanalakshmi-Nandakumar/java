
class A
{
    public void show()
    {
        System.out.println("From A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("From B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        
              A obj=new A();
              obj.show();
              C ob=new C();
              System.out.println(ob.marks);

    }
}