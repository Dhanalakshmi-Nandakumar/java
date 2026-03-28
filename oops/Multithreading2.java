class two extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("second run method");
        }
    }
}
public class Multithreading2 extends Thread{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("first run method");
        }
    }
    public static void main(String[] args) {
        Multithreading2 ob=new Multithreading2();
        ob.start();
        System.out.println("main method");
        
        two obj2=new two();
        obj2.start();
        System.out.println(Thread.activeCount());
    }
}