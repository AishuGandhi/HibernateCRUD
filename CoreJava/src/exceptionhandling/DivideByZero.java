package exceptionhandling;

import java.util.Scanner;

public class DivideByZero
{

    public static void main(String[] args)
    {
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int arr[] = new int[4];
        a = 9;
        b = sc.nextInt();
        try
        {
            for (int i = 0; i < 4; i++)
            {
                arr[i] = i + 1;
            }
            c = a / b;
            System.out.println("Output is:" + c);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of Bounds");
        }
        catch (ArithmeticException e)
        {
            //in case of throw no statments after that will be printed if no finally is there
            System.out.println("Cannot divide number by zero " + e);
            throw e;
        }
        catch (Exception e)
        {
            System.out.println("Unknown Exception" + e);
        }
        finally
        {
            System.out.println("FINALLY BYE");
        }
    }
}
