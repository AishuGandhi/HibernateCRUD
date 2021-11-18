package javabasics;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter Intger Number:");
        int num = sc.nextInt();
        int onum = num;
        int sum = 0;
        
        while(num>0)
        {
            int mod = num % 10;
            sum = sum + cube(mod);
            num = num /10;
        }
        if(sum == onum)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
    static int cube(int n)
    {
        return n*n*n;
    }
}
