class A
{
    public void showA()
    {
        System.out.println("A method");
    }
}
class B extends A
{
    public void showB()
    {
        System.out.println("b method");
    }
}
public class DownandUpCasting {
    public static void main(String[] args) {
      A obj=(A) new B(); //upcasting
      B obj1=(B) obj;//downcasting
      obj1.showB();

    }
}