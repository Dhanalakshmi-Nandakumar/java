enum Status
{
    Success,Failed,Pending,Running;
}
public class Enum {
    public static void main(String[] args) {
        Status s=Status.Failed;
                System.out.println(s);

        System.out.println(s.ordinal()); //index value of object 

        //to print all object in status class use values()
        Status[] ss=Status.values();
        for(Status val:ss)
        {
                           System.out.println(val+": "+val.ordinal());
 
        }


        //usecase of enum in switch case
        Status set=Status.Failed;
        switch(set)
        {
            case Success:
                System.out.println("Done");
                break;
            case Failed:
                System.out.println("try again");
                break;
            case Running:
                System.out.println("please wait ");
                break;
            default:
                System.out.println("it's pending..kindly wait ");
                break;


        }
    }
}