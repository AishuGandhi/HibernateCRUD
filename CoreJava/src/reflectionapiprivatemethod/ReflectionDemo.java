package reflectionapiprivatemethod;

class A
{
    private int i;
    public void ABC()
    {
        
    }
}
class B extends A
{
}
public class ReflectionDemo
{

     public static void main(String a[])throws Exception
    {
       Class c = Class.forName("reflectionapiprivatemethod.A");
       System.out.println(c.isInterface());
       System.out.println(c.getSuperclass());
       System.out.println(c.getDeclaredMethods());
       System.out.println(c.getDeclaredFields());
       c =  Class.forName("reflectionapiprivatemethod.B");
       System.out.println(c.getSuperclass());
    }
}
