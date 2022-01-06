package polymorphism;

public class MethodOverloading
{

    public static void main(String a[])
    {
       Demo d = new Demo();
       System.out.println(d.add());
       System.out.println(d.add(8));
       System.out.println(d.add(7.0));
        
    }
}
class Demo
{
  public int add()
  {
      return 5+3;
  }
  public int add(int k)
  {
      return 9 + k;
  }
  public float add(double a)
  {
      return (float) (6.0 + a);
  }

}
