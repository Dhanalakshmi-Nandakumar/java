class Website
{
    synchronized void register(String name)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("welcome "+name);
            System.out.println();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}
class User extends Thread
{
    Website ob;
    String name;
    User(Website ob,String name)
    {
          this.ob=ob;
          this.name=name;
    }
    public void run()
    {
        
        ob.register(name);
    }
}
public class Synchronization  {
    public static void main(String[] args)throws InterruptedException {
           Website ob=new Website();
           
           //same object passed 
           User obj1=new User(ob,"user1");
           obj1.start(); //new thread 1 created
           

           User obj2=new User(ob,"user2");
           obj2.start(); //new thread 2 created

           User obj3=new User(ob,"user3");
           obj3.start();
           
           
            
           
    }
}