public class ThreadSleep extends Thread {
    public void run()
    {
         for(int i=0;i<3;i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
            //hold and continue
           // Thread.yield();
            // try{
            //       Thread.sleep(1000);
            // }
            // catch(InterruptedException e)
            // {

            // }
            
            
        }
    }
    public static void main(String[] args)throws InterruptedException {
        ThreadSleep ob1=new ThreadSleep();
        //getting state of thread
         System.out.println(ob1.getState());

        ob1.start();
                ob1.start();

        
ThreadSleep ob2=new ThreadSleep();

ob2.start();

//join--- if one thread is running it will wait until that thread run
// ob1.join();
//         ob2.join();

//checking state of thread
//  System.out.println(ob1.getState());

//  System.out.println(ob2.getState());
//   System.out.println(ob2.isAlive());


    }
}