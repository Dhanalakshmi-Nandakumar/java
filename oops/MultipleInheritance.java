interface A{
      default void showA()
      {
         System.out.println("defalt method");

      }
}
interface B{
    final int a=90;
 void showB();
      
}
class C implements A,B
{
    // @Override
    // public void showA()
    //   {
    //     System.out.println("A interface");
    //   }

    @Override
    public void showB()
      {
        System.out.println("B interface");
      }

}
public class MultipleInheritance {
    public static void main(String[] args) {
      C obj=new C();
      obj.showA();
      obj.showB();
      System.out.println(B.a);
    }
}