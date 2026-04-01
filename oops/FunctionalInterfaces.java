@FunctionalInterface
interface A
{
         abstract void show();
}
    
public class FunctionalInterfaces {
    public static void main(String[] args) {
        A obj=()->System.out.println("Show");
            
        obj.show();
    }
}