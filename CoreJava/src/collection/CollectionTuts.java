package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTuts
{

    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(30);//To add number at index in collection you don't have index so use List/Set
        c.add(20);

        System.out.println(c);
        c.remove(10);
        for(Object o : c)
        {
            System.out.println("Collection:"+o);
        }
        //Add duplicate elements & numbers will be printed in the sequence
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(30);    
        list.add(2,50);
        System.out.println("List:"+list);
        
        Collections.sort(list);
        System.out.println("List After Sorting:");
        list.forEach(System.out::println);//Stream Expression using Lamda Expression
        
        //Add unique elements & randomly numbers are printed
        Set<Integer> set = new HashSet<>();
        set.add(70);
        set.add(90);
        set.add(60);
        set.add(30);
        set.add(50);
        System.out.println("Set:"+set);
        
        //Add unique elements & sorted numbers are printed
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(70);
        treeSet.add(90);
        treeSet.add(60);
        treeSet.add(30);
        treeSet.add(50);
        System.out.println("Tree Set:"+treeSet);
        
        //
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Aishwarya");
        System.out.println("HashMap:"+map);
        
        //To fetch values from collection
        System.out.println("Printing collection with iterator:");
        Iterator<Integer> i = treeSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Printing collection with enhanced for loop:");
        for(Integer obj: treeSet)
        {
            System.out.println(obj);
        }
        
    }

}
