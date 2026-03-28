class Multithread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Runnable interface");
        }
    }
}
public class Multithreading extends Thread{

    //overriding run() method
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("new thread");
        }
        
    }

    public static void main(String[] args) {
        
        Multithreading obj=new Multithreading();
        //obj.run(); //main thread is invoked
        obj.start(); //new thread is invoked or created
        for(int i=0;i<5;i++)
        {
            System.out.println("main thread");
        }

        //creating obj of Multithread2
        Multithread2 obj2=new Multithread2();
        Thread obj3=new Thread(obj2);
        obj3.start();
    }
}