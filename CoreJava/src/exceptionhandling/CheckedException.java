package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Checked Exception as JAVA Knows about it
        try
        {
            int a = 10;
            System.out.println("Enter Value for B:");
            int b = Integer.parseInt(br.readLine());
            int c = a / b;
            System.out.println("Value of C:" + c);
        }
        catch (IOException e)
        {
            System.out.println("Some Input Output Exception");
        }
    }

}
