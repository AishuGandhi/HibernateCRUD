package javabasics;

public class ShortHandOperators
{

    public static void main(String[] args)
    {
        int i = 5;
        i -= 2;
        System.out.println(i);
        i += 2;
        System.out.println(i);
        i *= 2;
        System.out.println(i);
        i /= 2;
        System.out.println(i);
        
        byte b = 1;
        //b = b*2.5 Not work as Double and Byte 
        b *= 2.5;//Type goes with E1 T(E1) op E2 by default
        System.out.println(b);
        
    }

}
