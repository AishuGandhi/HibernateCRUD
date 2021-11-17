package javabasics;

public class Palindrome
{

    public static void main(String[] args)
    {
       int num = 121;
       int onum = num;
       int rev = 0,s=0;
       while(num>0)
       {
           rev = num % 10;  
           num = num/10;
           s = rev + (s*10);
       }
       if(onum == s)
       {
           System.out.println("Number is palindrome");
       }
       else
       {
           System.out.println("Number is not palindrome");
       }
           

    }

}
