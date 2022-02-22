package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

//Run code on online Java Compiler to see Thread Safe is not there
class Counter
{
 // int count;
   AtomicInteger count = new AtomicInteger();
  public void increment()//use synchronized infront of void  public synchronized void increment
  {
      count.incrementAndGet();
  }
}

public class ThreadSafeExample
{

    public static void main(String[] args) throws Exception
    {
       Counter c = new Counter();
       Thread t1 = new Thread(()->
       {
           for(int i =1;i<=1000;i++)
           {
               c.increment();
           }
       });
       Thread t2 = new Thread(()->
       {
           for(int i =1;i<=1000;i++)
           {
               c.increment();
           }
       });
       t1.start();
       t2.start();
             
       t1.join();
       t2.join();
       System.out.println(c.count);                

    }

}
