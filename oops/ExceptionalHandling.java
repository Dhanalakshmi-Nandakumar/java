class MyException extends Exception
{
    public MyException(String s)
    {
         super(s);
    }
}
public class ExceptionalHandling {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]=new int[5];
        try{
             j=j/i;
              if(j==0)
                 throw new MyException("dont want to print zero");
             //System.out.println(nums[5]);
           }
        //it handles all exception -->parent exception
        catch(MyException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Division by zero error..  "+" :"+e);
        }
        //System.out.println(j);
        finally{
            System.out.println("Terminated program");
        }
        
    }
}