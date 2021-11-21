package javabasics;

public class LeftShiftRightShift
{

    public static void main(String[] args)
    {
        int a = 8;// 1 0 0 0 
        int b = a << 2; //shift by 2 bits 1 0 0 0 0 0 0 // 2 0s are added
        System.out.println("Left Shift:"+b);
        b = a >> 2;// 2 bits are removed
        System.out.println("Right Shift:"+b);

    }

}
