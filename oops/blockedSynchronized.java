class Web
{
    void register(String name)
    {
        synchronized(this)
        {
            System.out.println("welcome ");
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("welcome "+name);
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
    Web obj;
    String name;
    User(Web obj,String name)
    {
        this.obj=obj;
        this.name=name;
    }
    public void run()
    {     
        obj.register(name);
    }
}
public class blockedSynchronized {
    public static void main(String[] args) {
        // Web obj=new Web();
        // //creating 1 thread but same object
        // User object1=new User(obj,"user1");
       
        // //creating 2 thread but same object
        // User object2=new User(obj,"user2");
        //  object1.start();
        // object2.start();

        //static synchronized  -->class level

        Web obj1=new Web();
        
        //creating 1 thread but same object
        User object1=new User(obj1,"user1");
       
        //creating 2 thread but same object
        User object2=new User(obj1,"user2");
         object1.start();
        object2.start();

    }
}