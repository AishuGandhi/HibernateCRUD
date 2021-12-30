package multithreading;

import com.sun.istack.internal.logging.Logger;

public class MultiThread
{

    public static void main(String[] args)
    {
        A a = new A();
        a.start();
        
        B b = new B();
        b.start();

    }

}

class A extends Thread
{
    void show()
    {
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("Class A Hiii");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
              //Logger.getLogger(A.class.getName()).log();   
            }
        }
    }
    public void run()
    {
        show();
    }

}

class B extends Thread
{
    void show()
    {
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("Class B Hiii");
        }
    }
    public void run()
    {
        show();
    }
}