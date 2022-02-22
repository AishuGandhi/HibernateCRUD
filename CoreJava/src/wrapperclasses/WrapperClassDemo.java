package wrapperclasses;

import java.util.ArrayList;

public class WrapperClassDemo
{

    public static void main(String a[])
    {
        int i = 5;
        Integer intVar = new Integer(i);//....Boxing
        Integer intVar1 = i;//...autoBoxing as Java Compiler is doing since 1.5 Onwards
        
        int k = intVar.intValue();//...Unboxing
        System.out.println("Value of k:"+k);
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(intVar1);//Using autoboxing concept 
        list.add(9);
        
        //String To Integer
        //Integer to String
        
        
    } 
}
