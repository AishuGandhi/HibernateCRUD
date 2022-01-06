package abstractioninterface;

interface A
{
  void show();    
}
class B implements A
{
  public void show()
  {
      System.out.println("Hellloo Interface Demo");
  }
}
public class InterfaceDemo
{

    public static void main(String[] args)
    {
      B b = new B();
      b.show();
    }

}

