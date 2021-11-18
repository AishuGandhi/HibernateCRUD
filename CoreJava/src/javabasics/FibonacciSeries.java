package javabasics;

public class FibonacciSeries
{

    public static void main(String[] args)
    {
     int n1 = 0;
     int n2 = 1;
     System.out.print(n1+" "+n2+" ");
     int num = 5;
     for (int i=1;i<=5;i++)
     {
         num = n1 + n2;
         System.out.print(" "+num);
         n1 = n2;
         n2 = i;                                    
     }
    }
}
