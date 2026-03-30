class One{
   void method1(){
        System.out.println("Calling method 1");
    }
    void method2(){

    }

    }
  
class Two
{
    void method3(){

    }
    void method4(){

    }
}
public class Deadlock extends Thread{
    One obj1;
    Deadlock(One obj1)
    {
        this.obj1=obj1;
    }
    public void run()
    {
        obj1.method1();
    }
    public static void main(String[] args) {

        
              One obj1=new One();
              Deadlock object=new Deadlock(obj1);
              object.start();
    }
}