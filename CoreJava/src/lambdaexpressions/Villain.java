package lambdaexpressions;

public class Villain implements Actor
{

    @Override
    public void act()
    {
        System.out.println("I can act");       
    }
    @Override
    public void speak()
    {
      System.out.println("I can speak"); 
    }
    public void rude()
    {
        System.out.println("I am Rude");
    }
   
}
