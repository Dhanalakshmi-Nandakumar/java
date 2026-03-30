class One{
   synchronized void method1(Two obj2){
        System.out.println("Calling method 1");
        obj2.method4();

    }
     void method2(){
    System.out.println("Calling method 2");
    }

    }
  
class Two
{
    synchronized void method3(One obj1){
         System.out.println("Calling method 3");
         obj1.method2();
    }
    
   synchronized void method4(){
         System.out.println("Calling method 4");
    }
}
class Deadlock2 extends Thread{
    One obj1;
    Two obj2;

    Deadlock2(One obj1,Two obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void run()
    {
       obj2.method3(obj1);
    }
   
}
public class Deadlock1 extends Thread{
    One obj1;
    Two obj2;
    Deadlock1(One obj1,Two obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void run()
    {
        obj1.method1(obj2);
    }
    public static void main(String[] args) {

        
              One obj1=new One(); // 1object created
              Two obj2=new Two();
              Deadlock1 thread1=new Deadlock1(obj1,obj2);
              Deadlock2 thread2=new Deadlock2(obj1,obj2);
              thread1.start();
              thread2.start();

              

    }
}
