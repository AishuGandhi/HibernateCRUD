package ObjectCloning;

public class Cloning
{

    public static void main(String[] args)
    {
        /*
         * 1.Shallow Copy 2.Deep Copy 3.Object Cloning
         */
        System.out.println("Shallow Copy");
        A obj1 = new A();
        obj1.i = 5;
        obj1.j = 6;
        System.out.println(obj1);

        A obj2 = new A();
        System.out.println("Created object:" + obj2);

        obj2 = obj1;
        System.out.println(obj2);
        obj2.i = 9;// obj1.i = 9
        // Both objects pointing to same memory
        System.out.println("Object1:" + obj1);
        System.out.println("Object2:" + obj2);

        System.out.println("Deep Copy");
        A a1 = new A();
        a1.i = 7;
        a1.j = 6;
        System.out.println("A1:" + a1);
        A a2 = new A();
        a2.i = a1.i;
        System.out.println("A2:" + a2);
        a1.i = 10;
        System.out.println("A1:" + a1);// 10 6
        System.out.println("A2:" + a1);// 7 0

        System.out.println("Object Cloning");
        A x = new A();
        x.i = 90;
        x.j = 70;

        try
        {
            A y = (A) x.clone();
            System.out.println("X:"+x);
            System.out.println("Y:"+y);
            x.i = 100;
            System.out.println("X:"+x);
            System.out.println("Y:"+y);
        }
        catch (Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
//To give permission to clone the Object for security purpose to avoid hacking
class A implements Cloneable //Marker Interface
{
    int i, j;

    @Override
    public String toString()
    {
        return "A {i=" + i + ", j=" + j + "}";
    }
    
    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}