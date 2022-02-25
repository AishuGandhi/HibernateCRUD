package exercise;

import java.util.*;

public class CreateCollection
{

    public static void main(String[] args)
    {
        Set coll = new HashSet<>();     
        List list = new ArrayList<>();
        
        //Allows you to switch the data structures without any cosquences i.e you can changes Collection c = new ArrayDeque<>(); 
        //That is why Collection/List on right side of initialization
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("Dance");
        c.add("Drink");
        c.add("Drink");
        //Collection Provides Their Own toString() implemetation
        System.out.println(c);
        
        //Converting 1 collection to another
        Collection<String> favThings = new HashSet<>(c);
        System.out.println(favThings);

    }

}
