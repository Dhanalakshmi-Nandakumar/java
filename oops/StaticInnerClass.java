class A{
    static private int id=1;
    static class B{
        void show()
        {
                    System.out.println(id);

        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
         A obj=new A();
         A.B obj1=new A.B();
         obj1.show();

    }
}