package javabasics;

class A
{
    //Cannot use instant variable as it keeps changing as per object so static
    static int i = 0;
    public A()
    {
       i++; 
    }
    public void count()
    {
      System.out.println("Number of Objects are :"+i);
    }
}

public class NumberofObjects
{
    //Before even calling main method static block is called
    static 
    {
        System.out.println("Hello in the world of programming!!!");
        
    }
    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        a3.count();
    }
}
