package multithreading;

public class MultiThread
{

    public static void main(String[] args)
    {
       /* A a = new A();
        //a.run() to consider A class object as separate thread not as a part of main thread
        a.start();
        
        B b = new B();
        Thread t = new Thread(b);
        t.start();
        */
        /*Runnable r = new Runnable() {
            @Override
            public void run()
            {
                for (int i = 0; i <= 4; i++)
                {
                    System.out.println("Runnable Interface");
                }

            }
        };*/
        //Runnable interface is  single abstract method interface  as it has only 1 method
        /*Thread thread = new Thread( new Runnable() 
        {
            @Override
            public void run()
            {
                for (int i = 0; i <= 4; i++)
                {
                    System.out.println("Runnable Interface");
                }

            }
        });*/
      //lambda expression to avoid number of lines

        //Thread thread =
                        new Thread( () -> 
            {
                for (int i = 0; i <= 4; i++)
                {
                    System.out.println("Hiii");
                    try
                    {
                        Thread.sleep(200);
                    }
                    catch(InterruptedException ie)
                    {
                        
                    }
                }
    
            }
        ).start();
                        new Thread( () -> 
                        {
                            for (int i = 0; i <= 4; i++)
                            {
                                System.out.println("Hello");
                               
                            }
                
                        }
                    ).start();
        //thread.start();
        new Thread( () -> new MultiThread().show("Inside Show")).start();                
    }
    public void show(String str)
    {
        System.out.println(str);
    }

}

class A extends Thread
{
    void show()
    {
        for (int i = 0; i <5; i++)
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

class B extends C implements Runnable 
{
    public void run()
    {
        for (int i = 0; i <= 4; i++)
        {
            System.out.println("Class B Hello");
        }
    }
}
class C
{
  public void demo()
  {
      
  }
}