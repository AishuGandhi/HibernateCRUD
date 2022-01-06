package abstractioninterface;

abstract class Animal
{
    abstract public void animalSound();
    public void sleep()
    {
        System.out.println("Zzzzzzzzzzzz");
    }
}
class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("Weeeeeeeeeeeeee");
    }
}
public class AbstractDemo
{

    public static void main(String[] args)
    {
       Pig p = new Pig();
       p.sleep();
       p.animalSound();
    }

}

