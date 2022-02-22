package lambdaexpressions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo1
{

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        /**
         * External Iterations
         */
        /**
         * Using Enhanced For Loop
         */
       /* 
         for(int a : list)
        {
            System.out.println(a);
        }*/
        /**
         *Simple For Loop
         */
        /*
        for(int i=0;i<6;i++)
        {
            System.out.println(list.get(i));
        }*/
        /**
         * Using Iterator
         */
        /*Iterator<Integer> i = list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }*/
        /**
         * Internal Iterations
         * Use Stream Api
         */
        list.forEach(j->System.out.println(j));
        
        
    }
}
