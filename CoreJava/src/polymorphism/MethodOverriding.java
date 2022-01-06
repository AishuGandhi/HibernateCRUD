package polymorphism;

public class MethodOverriding
{
    public static void main(String[] args)
    {

        B b = new B();
        b.show();
    }
}

class A
{
    public void show() {
        System.out.println("Hi I am A");
    }
}

class B extends A
{
    public void show()
    {
        super.show();
        System.out.println("Hi I am B");
    }
}
