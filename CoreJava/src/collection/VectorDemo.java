package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo
{

    public static void main(String[] args)
    {
       System.out.println("Vector");
       Vector<Integer> v = new Vector<>();
       v.add(10);
       v.add(120);
       System.out.println("Size"+v.size());
       System.out.println("Capacity:"+v.capacity());
       for (int i : v)
       {
           System.out.println(i);
       }
       v.remove(0);
       for (int i : v)
       {
           System.out.println(i);
       }
       
       System.out.println("ArrayList");
       List<Integer> list = new ArrayList<>();
       System.out.println(list.size());
      
    }

}
