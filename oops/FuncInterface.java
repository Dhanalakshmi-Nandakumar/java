@FunctionalInterface
interface Abc
{
   //void show(int val);
   int add(int x,int y);
   
}
// class B implements Abc
// {
    
// }
public class FuncInterface {
    public static void main(String[] args) {
        //lambda expression
        // Abc obj=()->System.out.println("B method");
        // obj.show();

         //Anonmymous class 

        // Abc obj1=new Abc()
        // {
        //    public void show(int val)
        //    {
        //     System.out.println("B method "+val);
        //    }
        // };
        //         obj1.show(100);

       //lamba
        // Abc obj1=(int val)->System.out.println("B method "+val);
        //         obj1.show(100);


        //Anonmymous class 
        // Abc obj=new Abc()
        // {
        //    public int add(int x,int y)
        //    {
        //      return x+y;
        //    }
        // };

        // int result=obj.add(6,7);
        // System.out.println(result);
  

  //lambda

//    Abc obj=(int x,int y)->
//    {
//     return x+y;
//    };

           //or

           Abc obj=(x,y)->x+y;
         

        int result=obj.add(6,7);
        System.out.println(result);

    }
}