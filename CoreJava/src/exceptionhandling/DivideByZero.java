package exceptionhandling;

public class DivideByZero
{

    public static void main(String[] args)
    {
       int a,b,c=0;
       a = 9;
       b = 0;
       try
       {
           c = a/b;
       }
       catch(ArithmeticException e)
       {
           System.out.println("Cannot divide number by zero");
       }
       System.out.println(c);

    }

}
