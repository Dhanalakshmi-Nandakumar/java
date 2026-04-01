import java.util.*;
class Student{
    int age;
    String name;
    public Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public String toString()
    {  
         return "[age ="+age+ ", name = "+name+"]";
    }
}
public class Comparators {
    public static void main(String[] args) {

        //comparator is a functional interface we can use lambda expression here
        Comparator<Student> com=new Comparator<Student>(){
         
         //overrifing compare method
         public int compare(Student i,Student j)
         {
            if(i.age > j.age)
              //swap the value
              return 1;
            else 
              return -1;
         }
        };
       List <Student> li=new ArrayList<>();
       li.add(new Student(21,"dhana"));
       li.add(new Student(17,"ramu"));
       li.add(new Student(30,"divya"));
       Collections.sort(li,com);
       //System.out.println(li);
       for(Student s:li)
       {
               System.out.println(s);

       }
    }
}