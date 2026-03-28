class two extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("second run method");
            //System.out.println("second Thread name "+Thread.currentThread().getName());
        }
    }
}
public class Multithreading2 extends Thread{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("first run method");
           // System.out.println("first Thread name "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Multithreading2 ob=new Multithreading2();
        //invoking the thread via start
        ob.start();
         //setting thread name
       
        //System.out.print("main method  ");
       // System.out.println("Main Thread name "+Thread.currentThread().getName());
        
        two obj2=new two();
        obj2.start();
        //setting thread name
        obj2.setName("second thread");
                 //obj2.setPriority(10);

         //ob.setPriority(1);
        
       // System.out.println(Thread.activeCount());
        //System.out.println("Thread name "+ob.getName());
                //System.out.println("Thread name "+obj2.getName());
                       // System.out.println("Main Thread name "+Thread.currentThread().getName());

                       //getting priority
                       System.out.println(ob.getPriority());
                        System.out.println(obj2.getPriority());
                         System.out.println(Thread.currentThread().getPriority());


    }
}