package abstractioninterface;

interface A
{
  void show();    
}
interface C
{
    
  void show();    
  static void display()
  {
      System.out.println("Static method in Interface");
  }
}
interface I
{
    
 default void show()
 {
     System.out.println("Default from Show I interface");
 }
}
class D
{
  public void show()
  {
      System.out.println("In Show from class D");
  }
}
class B extends D implements I
{
  public void show()
  {
      System.out.println("Hellloo Interface Demo");
  }
}
class E extends D implements I
{
    
    
}
/*
   Marker Interface -> Interface Without Any Methods
   SAM/Functional Interface -> Single Abstract Method having only 1 method For example: Runnable
   Normal Interface
 */
public class InterfaceDemo
{

    public static void main(String[] args)
    {
      B b = new B();
      b.show();
      E e = new E();
      e.show();
      C.display();
      /*A a = new A()
      {
          public void show()
          {
              System.out.println("In Show");
          }
      };
      a.show();*/
      //Lambda Expression
      A a = () ->System.out.println("In Show");
      a.show();
    }
}

