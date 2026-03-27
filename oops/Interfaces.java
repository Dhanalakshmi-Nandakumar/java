interface A
{
    int age=23; //by default final and static 
    void show();

}
interface B extends A
{

}
class C implements A, B
{
    public void show()
    {
        System.out.println("In show");
    }
}
public class Interfaces {
    public static void main(String[] args) {
         C obj=new C();
         obj.show();
         System.out.println(A.age);

    }
}