package javabasics;

public class CommaSeperatedString
{

    public static void main(String[] args)
    {
        String str = "Aishwarya,DJ,Sushmita,Sanjana";
        String a[] = str.split(",");
        for (String name : a)
        {
            System.out.println(name);
        }
    }
}
