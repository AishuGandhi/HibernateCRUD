package javabasics;

import java.util.Scanner;

public class Swapping
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.print("Enter 2 numbers:\nNumber1:");
        a = sc.nextInt();
        System.out.println("Number2:");
        b = sc.nextInt();
        
        System.out.println("Using Temp Variable\nBefore Swapping \nNumber1:"+a+"\tNumber2:"+b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After Swapping \nNumber1:"+a+"\tNumber2:"+b);
        
        
        System.out.println("Without Temp Variable(Using + -)\nBefore Swapping \nNumber1:"+a+"\tNumber2:"+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping \nNumber1:"+a+"\tNumber2:"+b);
        
        
        System.out.println("Without Temp Variable(Using * /)\nBefore Swapping \nNumber1:"+a+"\tNumber2:"+b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After Swapping \nNumber1:"+a+"\tNumber2:"+b);
        
        
        

    }

}
