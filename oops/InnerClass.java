class A{
    int age;
    public void show()
    {
        System.out.println(" in show");
    }
    static class B
    {
        public void sing()
        {
                    System.out.println(" im singing");

        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
           A obj=new A();
           obj.show();
           A.B obj1=new A.B();
           obj1.sing();
    }
}