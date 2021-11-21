package javabasics;

public class JaggedArray
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 6, 7 };
        int c[] = { 8, 9, 10 };
        int array[][] = { a, b, c };
        
        //Number of columns not fixed
        int k[][]= new int[3][];
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[3];
        
        //as it returns a whole row as a array
        for (int i[] : array)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
