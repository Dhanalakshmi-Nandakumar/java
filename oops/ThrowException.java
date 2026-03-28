public class ThrowException {
     static void checkAge(int age)
        {
            if(age>18)
            {
                throw new IllegalArgumentException("Age must be 18 or greater than 18 to be eligible for vote!");
            }
        }
    public static void main(String[] args) {
       checkAge(21);
                 
    }
}