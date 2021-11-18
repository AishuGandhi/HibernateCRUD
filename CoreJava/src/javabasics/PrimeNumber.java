package javabasics;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i < num; i++)
        {

            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
