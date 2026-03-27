class A
{
  public void show()
  {
    System.out.println(" In show method");
  }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
         A obj=new A()
         {
            //it is overriding the method
                 public void show()
                   {
                       System.out.println(" In new show method");
                   }
         };
         obj.show();
    }
}