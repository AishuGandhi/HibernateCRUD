package exceptionhandling;

public class ThrowException
{
    public static void main(String[] args)
    {
        int a =0;
        int b = 9;
        int c = 0;
        try
        {
            c = a + b;
            if(c<10)
            {
                throw new ArithmeticException();
            }
            System.out.println("Addition:"+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Addition must be greater than or equal to 10");
           e.printStackTrace();
        }
    }
}
