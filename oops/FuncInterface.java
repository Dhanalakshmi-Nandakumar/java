@FunctionalInterface
interface Abc
{
   void show();
   
}
// class B implements Abc
// {
    
// }
public class FuncInterface {
    public static void main(String[] args) {
        Abc obj=new Abc()
        {
           public void show()
    {
        System.out.println("B method");
    } 
        };
        obj.show();

    }
}