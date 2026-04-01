import java.util.*;
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public int compareTo(Student that)
    {
        if(this.age > that.age)
              //swap the value
              return 1;
            else 
              return -1;
    }
    public String toString()
    {  
         return "[age ="+age+ ", name = "+name+"]";
    }
}
public class Comparables {
    public static void main(String[] args) {

        //comparator
        // Comparator<Student> com=new Comparator<Student>(){
         
        //  //overrifing compare method
        //  public int compare(Student i,Student j)
        //  {
        //     if(i.age > j.age)
        //       //swap the value
        //       return 1;
        //     else 
        //       return -1;
        //  }
        // };

            //using lamba expression
        Comparator<Student> com=(i,j)-> (i.age > j.age)?1:-1;
 

       List <Student> li=new ArrayList<>();
       li.add(new Student(21,"dhana"));
       li.add(new Student(17,"ramu"));
       li.add(new Student(30,"divya"));

       //comparator
       //Collections.sort(li,com);

          //comparable
        Collections.sort(li);

       //System.out.println(li);
       for(Student s:li)
       {
               System.out.println(s);

       }
    }
}