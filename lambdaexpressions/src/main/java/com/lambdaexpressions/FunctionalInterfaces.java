package com.lambdaexpressions;

import java.util.function.*;

public class FunctionalInterfaces
{

    public static void main(String[] args)
    {
       Predicate<String> strLen = (s) -> s.length() < 10;
       System.out.println(strLen.test("AppleBanana"));
       
       Consumer<String> consum = (s)->   System.out.println(s.toLowerCase());
       consum.accept("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
       
       //1st Parameter is value to accept 
       //2nd Parameter is return type
       Function<Integer,String> func = (number) -> Integer.toString(number);
       System.out.println(func.apply(45).length());

       Supplier<String> supply = ()->"Java is fun";
       System.out.println(supply.get());
       
       UnaryOperator<Integer> unary = (number) -> number+10;
       System.out.println(unary.apply(10));
       
       BinaryOperator<Integer> binary = (number1,number2) -> number1*number2;
       System.out.println(binary.apply(20, 30));
    }

}
