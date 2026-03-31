public class WrapperCls {
    public String toString()
    {
        return "hello";
    }
    public static void main(String[] args) {
           char a='s';
           Character word=a; //autoboxing
            System.out.println(word.getClass());
            System.out.println(word);
    }
}