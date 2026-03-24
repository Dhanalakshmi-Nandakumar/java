import java.util.*;
class Calculator
{
    private int num1;
    private int num2;
    Calculator(){
      System.out.println("object created");
    }
     Calculator(int num1,int num2)
    {
        this();
        this.num1=num1;
        this.num2=num2;
    }
    int sum()
    {
        return num1+num2;
    }
}
public class Basics{
   public static void main(String args[])
   {

    //object with reference
      Calculator obj=new Calculator(2,3);
      int result=obj.sum();
      System.out.println(result);
      //no reference to this object
      new Calculator().sum();
//       Scanner in=new Scanner(System.in);

//      // arrays
//       int arr[]=new int[5];
//       for(int i=0;i<5;i++)
//       {
//         arr[i]=in.nextInt();
//       }
//       System.out.println(Arrays.toString(arr));

//     //string concepts
//     String name="Dhana";
//     System.out.println(name.charAt(2));
//     System.out.println(name.length());
//     System.out.println(name.substring(1,4));

//         String a = "hello";
//         String b = "hello";
// System.out.println(a == b);       // true (same pool)
// System.out.println(a.equals(b));  // true (content)

// String c=new String("is");
// String d=new String("is");
// String f=new String("fun");
// System.out.println(c==d);
// System.out.println(c.equals(d));
// System.out.println(c.toUpperCase());
// String e="dhana   ";
// System.out.println(e);
// System.out.println(e.trim());
// System.out.println(e.replace('d','S'));
// System.out.println(e.contains("ana"));
// System.out.println(e.codePointAt(1));
// System.out.println(e.codePointBefore(2));
// System.out.println(e.codePointAt(3));
// System.out.println(c.compareTo(d));
// System.out.println(c.compareToIgnoreCase(d));
// System.out.println(c.concat(d));
// System.out.println(c.contentEquals("Hi"));
// System.out.println(c.equals(d));
// System.out.println(c.concat(d).concat(f));
// String fruits="govaapple banana";
// String arr1[]=fruits.split(" ");
// for(String x:arr1)
// {
//    System.out.println(x); 
// }
// System.out.println(fruits.indexOf('p'));
    }
}