class LimitReachedException extends Exception
{
    LimitReachedException()
    {
         super();
    }
    LimitReachedException(String s)
    {
         super(s);
    }
}
class Bank{
    public int balance=60000;
    public int limit=40000;
    void withdraw(int amount) throws LimitReachedException
    {
        if(amount>limit)
        {
            throw new LimitReachedException("Limit reached ...please try after 24 hours");
        }
        balance-=amount;
        System.out.println("withdraw successfully");
    }
}
public class exceptions {
    public static void main(String[] args) throws LimitReachedException  {
       Bank obj=new Bank();
       obj.withdraw(41000);
    }
}