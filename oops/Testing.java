
class Bank{
    private int balance =2000;
    void deposit()
    {
          System.out.println("deposit");
    }
    class Gpay{
        String name="dhana";
        void pay()
        {
            balance+=2000;
            System.out.println("updated balance amount is "+balance);
        }
    }
    //method local inner class
    void netBanking()
    {
       
        class checkStatement
        {
            void show()
            {
                System.out.println("Download your statement pdf ");
            }

        }
        checkStatement obj=new checkStatement();
       obj.show();
    }
}
abstract class Apple{
    public abstract void eating();
   
}


public class Testing {
    public static void main(String[] args) {
        
       Bank ob=new Bank(){
         void deposit()
    {
          System.out.println("deposit new");
    }
       };
       ob.netBanking();
       ob.deposit();
       Bank.Gpay obj=ob.new Gpay();
      obj.pay();

      Apple object=new Apple()
      {
         public void eating()
    {
         System.out.println("Eat and Sleeeeping ");
    }
      };
      object.eating();

      //Thread class override
      Thread t=new Thread(){
        public void run()
        {
            System.out.println("Overriding in anonymous inner class");
        }
      };
      t.start();
      Runnable r=new Runnable()
      {
         public void run()
        {
            System.out.println("Runnable--Overriding in anonymous inner class");
        }
      };
      Thread objs=new Thread(r);
      objs.start();
    }
}