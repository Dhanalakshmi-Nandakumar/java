
public class SingletonClass {
    private SingletonClass()
    {

    } 
    private static SingletonClass ob1;
    public static SingletonClass instance()
    {
        if(ob1==null)
        {
            ob1=new SingletonClass();
        }
        return ob1;
    }

    public static void main(String[] args) {
         
SingletonClass.instance();
            System.out.println(ob1);

SingletonClass.instance();
            System.out.println(ob1);
  SingletonClass obj=new SingletonClass();
              System.out.println(obj);
          


    }
}