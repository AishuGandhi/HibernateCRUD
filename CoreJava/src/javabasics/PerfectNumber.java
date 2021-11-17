package javabasics;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        int n = 6, i = 1, sum = 0;     
        while (i < n)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(n == sum)
        {
            System.out.print("Number is perfect");
        }
        else
        {
            System.out.print("Number is not perfect");
        }
    }
}
