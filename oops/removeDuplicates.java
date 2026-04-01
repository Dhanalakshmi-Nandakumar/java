import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        int arr[]={10,20,30,10,30,40,550,550};
        Set<Integer> set=new HashSet<>();
        for(Integer i:arr)
        {
            if(set.contains(i))
            {
                System.out.println("Duplicated found");
            }
            set.add(i);
        }
        System.out.println(set);

    }
}