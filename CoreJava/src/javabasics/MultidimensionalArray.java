package javabasics;

public class MultidimensionalArray
{

    static public void main(String... args)
    {
        int a[] = new int[4];
        int b[][] = new int[3][3];
        int c[][][] = new int[2][2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                for (int k = 0; k < 2; k++)
                {
                    c[i][j][k] = i + j +k;
                }
            }
        }

    //i = array_index
    // j = row_index
    //k = column_index
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0; k < 2; k++)
            {
                System.out.println(c[i][j][k]+" ");
            }
           
        }
        System.out.println("");
    }

}

}
