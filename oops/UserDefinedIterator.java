import java.util.*;
class User
{
    int id;
    String name;
    String job;
    User(int id,String name,String job)
    {
        this.id=id;
        this.name=name;
        this.job=job;
    }
    public String toString()
    {
        return id+" "+name+" "+job;
    }
}
public class UserDefinedIterator {
    public static void main(String[] args) {
         ArrayList<User> ar=new ArrayList<>();
         ar.add(new User(1,"ram","Engineer"));
         ar.add(new User(2,"raghu","testing")) ;
         ar.add(new User(1,"dhana","lead"));

         for(User u:ar)
         {
            System.out.println(u);
         }
    }
}