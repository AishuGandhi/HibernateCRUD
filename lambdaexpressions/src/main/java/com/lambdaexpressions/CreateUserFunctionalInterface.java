package com.lambdaexpressions;

public class CreateUserFunctionalInterface
{
    public static void main(String[] args)
    {
        Calculate add = (a, b) -> a+b;
        Calculate diff = (a,b) -> Math.abs(a-b);
        Calculate divide = (a,b)-> b!=0?a/b:0;
        Calculate multiply = (a,b) -> a*b;
        
        System.out.println("Sum:"+add.calc(20, 30));
        System.out.println("Difference:"+diff.calc(20, 30));
        System.out.println("Divide:"+divide.calc(20, 5));
        System.out.println("Multiply:"+multiply.calc(20, 5));
    }
   

}
