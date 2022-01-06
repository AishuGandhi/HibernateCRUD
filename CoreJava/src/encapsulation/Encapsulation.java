package encapsulation;

public class Encapsulation
{

    public static void main(String[] args)
    {
        A a = new A();
        a.setI(10);

    }

}

class A
{
    private int j;

    public void setI(int i)
    {
        j = i;

    }
}
