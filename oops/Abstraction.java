abstract class Car
{
    int age;
   abstract public void drive();
   public void playMusic()
   {
            System.out.println("playingg music..");

   }

}
class Tata extends Car
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}
public class Abstraction {
    public static void main(String[] args) {
            Tata obj=new Tata();
            obj.drive();
            obj.playMusic();
            obj.age=23;
                    System.out.println(obj.age);

                }
}