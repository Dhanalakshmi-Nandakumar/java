class Employee
{
    int empId;
    String name;
    Employee(int empId,String name)
    {
        this.empId=empId;
        this.name=name;
    }
    Employee(Employee obj2)
    {
        empId=obj2.empId;
        name=obj2.name;
    }
    void getDetails()
    {
        System.out.println(empId+" "+name);
    }

}
public class copyConstructor {
    public static void main(String[] args) {
        Employee obj1=new Employee(1,"deepa");
        obj1.getDetails();
         Employee obj2=new Employee(obj1);
         obj2.getDetails();
    }
}