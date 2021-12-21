package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsSupressError
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Checked Exception as JAVA Knows about it
        int a = 10;
        System.out.println("Enter Value for B:");
        int b = Integer.parseInt(br.readLine());
        int c = a / b;
        System.out.println("Value of C:" + c);
       
    }
}
