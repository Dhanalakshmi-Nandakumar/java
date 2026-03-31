public class Finalize {
     static public void show()
    {
        Finalize f=new Finalize();
    }
    
    public void finalize() throws Throwable
    {
        System.out.println("object is collected by garbage collection");
    }
    public static void main(String[] args) {
        
       Finalize.show();
       System.gc();

    }
}